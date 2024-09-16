package com.api.openai.controllers;

import com.api.openai.models.ChatCompletionRequest;
import com.api.openai.models.ChatCompletionResponse;
import com.api.openai.models.Message;
import com.api.openai.models.OpenAiClient;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
@RequestMapping("/api/chat")
public class ChatCompletionController {

    @Value("$(openai.model)")
    private String model;

    @Autowired
    private OpenAiClient openAiClient;
    @PostMapping("/ask")
    public String askQuestion(@RequestBody String question) {
        ChatCompletionRequest request = new ChatCompletionRequest();
        request.setModel(model);

        Message message = new Message();
        message.setRole("user");
        message.setContent(question);

        request.setMessages(List.of(message));

        ResponseEntity<String> response = openAiClient.getChatCompletionResponse(request);

        ChatCompletionResponse completionResponse = new Gson().fromJson(response.getBody(), ChatCompletionResponse.class);

        return completionResponse.getChoices().get(0).getMessage().getContent();

    }



}

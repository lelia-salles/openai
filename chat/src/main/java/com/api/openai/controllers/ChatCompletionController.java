package com.api.openai.controllers;

import com.api.openai.models.OpenAiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatCompletionController {

    @Value("$(openai.model)")
    private String model;

    @Autowired
    private OpenAiClient openAiClient;

    public String askQuestion(RequestBody String question) {


    }



}

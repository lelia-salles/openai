package com.api.openai.models;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
 
/*
 * This interface, OpenAiClient, is a Feign client, which is a declarative HTTP client 
 * provided by the Spring Cloud OpenFeign project. It's used to make HTTP requests to an external API, in this case,
 *  the OpenAI API. The Feign client is annotated with @FeignClient and is named "OpenAiClient". In the context 
 * of the application, this interface is likely used to interact with the OpenAI API to retrieve chat completions, 
 * which are AI-generated responses to user input. The getRequestResponse method would be used to send a request 
 * to the OpenAI API with a specific prompt or input, and the response would contain the generated completion.
 */

@FeignClient(name = "OpenAiClient", url = "https://api.openai.com")
public interface OpenAiClient {
    
    @getMapping(path = "/v1/chat/completions")
    @RequestEntity<String> getRequestResponse(@RequestBody request);

    ResponseEntity<String> getChatCompletionResponse(ChatCompletionRequest request);
}

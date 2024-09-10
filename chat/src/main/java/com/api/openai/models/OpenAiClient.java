package com.api.openai.models;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 

@FeignClient(name = "OpenAiClient", url = "https://api.openai.com/")
public interface OpenAiClient {
    
    @PostMapping(value = "/v1/chat/completions")
    @ResponseEntity<String> getResponse(@RequestBody ChatCompletionRequest request);
}

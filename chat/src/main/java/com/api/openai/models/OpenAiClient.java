package com.api.openai.models;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "openAiClient", url = "https://api.openai.com")
public interface OpenAiClient {

    @PostMapping("/v1/chat/completions")
    ResponseEntity<String> getResponse(RequestBode ChatCompletionRequest request)

}

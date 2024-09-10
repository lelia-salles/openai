package com.api.openai.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value; 

@Configuration
public class FeignConfig {

    @value  ("${openai.api-key}")
    private String apiKey;

    @Bean    
    protected RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate.header("Authorization", "Bearer " + apiKey);
        return requestTemplate -> requestTemplate.header("Content-Type:", " application/json");
    }

}

package com.api.openai.config;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Value("${openai.api-key}")
    private String apiKey;

    @Bean    
    protected RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("Authorization", "Bearer " + apiKey);
            requestTemplate.header("Content-Type", " application/json");
        };
    }
}

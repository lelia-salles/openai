package com.api.openai.models;
import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.ArrayList;

public class ChatCompletionRequest {

        public ArrayList<Message> messages;
        public String model;        
        public boolean logprobs;
        public int top_logprobs;

}

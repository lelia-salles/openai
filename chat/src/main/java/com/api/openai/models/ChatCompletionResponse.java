package com.api.openai.models;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.ArrayList;

public class ChatCompletionResponse {
    
    public ArrayList<Choice> choices;
    public String id;
    public String object;
    public int created;
    public String model;   
    public Usage usage;
    public Object system_fingerprint;
}
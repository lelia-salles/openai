package com.api.openai.models;
import java.util.ArrayList;

public class ChatCompletionResponse {
    
    public ArrayList<Choice> choices;
    public String id;
    public String object;
    public int created;
    public String model;
    public String system_fingerprint;    
    public Usage usage;

}

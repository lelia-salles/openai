package com.api.openai.models;
import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.ArrayList;

public class ChatCompletionRequest {
    @JsonProperty("model") 
    public String getModel() { 
		 return this.model; } 
    public void setModel(String model) { 
		 this.model = model; } 
    String model;
    @JsonProperty("messages") 
    public ArrayList<Message> getMessages() { 
		 return this.messages; } 
    public void setMessages(ArrayList<Message> messages) { 
		 this.messages = messages; } 
    ArrayList<Message> messages;
    @JsonProperty("max_tokens")

}

package com.api.openai;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.ArrayList;

public class Message {

    @JsonProperty("role") 
    public String getRole() { 
		 return this.role; } 
    public void setRole(String role) { 
		 this.role = role; } 
    String role;
    @JsonProperty("content") 
    public String getContent() { 
		 return this.content; } 
    public void setContent(String content) { 
		 this.content = content; } 
    String content;
}




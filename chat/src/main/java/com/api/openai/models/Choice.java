package com.api.openai.models;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.ArrayList;

public class Choice {

    @JsonProperty("index") 
    public int getIndex() { 
		 return this.index; } 
    public void setIndex(int index) { 
		 this.index = index; } 
    int index;
    @JsonProperty("message") 
    public Message getMessage() { 
		 return this.message; } 
    public void setMessage(Message message) { 
		 this.message = message; } 
    Message message;
    @JsonProperty("logprobs") 
    public Object getLogprobs() { 
		 return this.logprobs; } 
    public void setLogprobs(Object logprobs) { 
		 this.logprobs = logprobs; } 
    Object logprobs;
    @JsonProperty("finish_reason") 
    public String getFinish_reason() { 
		 return this.finish_reason; } 
    public void setFinish_reason(String finish_reason) { 
		 this.finish_reason = finish_reason; } 
    String finish_reason;
}

}

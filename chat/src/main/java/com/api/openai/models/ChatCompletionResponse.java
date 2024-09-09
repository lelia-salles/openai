package com.api.openai.models;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.ArrayList;

public class ChatCompletionResponse {
    
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("object") 
    public String getObject() { 
		 return this.object; } 
    public void setObject(String object) { 
		 this.object = object; } 
    String object;
    @JsonProperty("created") 
    public int getCreated() { 
		 return this.created; } 
    public void setCreated(int created) { 
		 this.created = created; } 
    int created;
    @JsonProperty("model") 
    public String getModel() { 
		 return this.model; } 
    public void setModel(String model) { 
		 this.model = model; } 
    String model;
    @JsonProperty("system_fingerprint") 
    public String getSystem_fingerprint() { 
		 return this.system_fingerprint; } 
    public void setSystem_fingerprint(String system_fingerprint) { 
		 this.system_fingerprint = system_fingerprint; } 
    String system_fingerprint;
    @JsonProperty("choices") 
    public ArrayList<Choice> getChoices() { 
		 return this.choices; } 
    public void setChoices(ArrayList<Choice> choices) { 
		 this.choices = choices; } 
    ArrayList<Choice> choices;
    @JsonProperty("usage") 
    public Usage getUsage() { 
		 return this.usage; } 
    public void setUsage(Usage usage) { 
		 this.usage = usage; } 
    Usage usage;
}
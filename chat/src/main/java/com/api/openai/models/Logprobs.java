package com.api.openai.models;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.ArrayList;

public class Logprobs {

          private ArrayList<Content> content;

    public ArrayList<Content> getContent() {
        return content;
    }

    public void setContent(ArrayList<Content> content) {
        this.content = content;
    }
}
    



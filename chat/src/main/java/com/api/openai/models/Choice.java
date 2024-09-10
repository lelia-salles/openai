package com.api.openai.models;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.ArrayList;

public class Choice {

    public int index;
    public Message message;
    public Logprobs logprobs;
    public String finish_reason;
}



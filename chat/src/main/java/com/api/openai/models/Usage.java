package com.api.openai.models;

import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.annotation.JsonProperty; 
import java.util.ArrayList;

public class Usage{
    public int prompt_tokens;
    public int completion_tokens;
    public int total_tokens;
}

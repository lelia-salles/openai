package com.api.openai.models;

import java.util.ArrayList; 

public class Content {

    public String token;
    public double logprob;
    public ArrayList<int> bytes;
    public ArrayList<TopLogprob> top_logprobs;

}

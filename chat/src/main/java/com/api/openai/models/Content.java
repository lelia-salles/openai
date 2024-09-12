package com.api.openai.models;

import java.util.List;

public class Content {

    private String token;
    private double logprob;
    private List<Double> bytes;
    private List<TopLogprobs> top_logprobs;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double getLogprob() {
        return logprob;
    }

    public void setLogprob(double logprob) {
        this.logprob = logprob;
    }

    public List<Double> getBytes() {
        return bytes;
    }

    public void setBytes(List<Double> bytes) {
        this.bytes = bytes;
    }

    public List<TopLogprobs> getTop_logprobs() {
        return top_logprobs;
    }

    public void setTop_logprobs(List<TopLogprobs> top_logprobs) {
        this.top_logprobs = top_logprobs;
    }
}

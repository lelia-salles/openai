package com.api.openai.models;

import java.util.ArrayList;

public class TopLogprobs {

    private String token;
    private double logprob;
    private ArrayList<Double> bytes;

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

    public ArrayList<Double> getBytes() {
        return bytes;
    }

    public void setBytes(ArrayList<Double> bytes) {
        this.bytes = bytes;
    }
}

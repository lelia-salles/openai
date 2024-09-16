package com.api.openai.models;

public class Choice {

    private int index;
    private Message message;
    private Logprobs logprobs;
    private String finish_reason;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Logprobs getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(Logprobs logprobs) {
        this.logprobs = logprobs;
    }

    public String getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }
}



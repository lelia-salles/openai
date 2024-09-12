package com.api.openai.models;

import java.util.List;

public class ChatCompletionResponse {
    
    private List<Choice> choices;
    private String id;
    private String object;
    private int created;
    private String model;
    private Usage usage;
    private Object system_fingerprint;

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public Object getSystem_fingerprint() {
        return system_fingerprint;
    }

    public void setSystem_fingerprint(Object system_fingerprint) {
        this.system_fingerprint = system_fingerprint;
    }
}
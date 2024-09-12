package com.api.openai.models;
import java.util.List;

public class ChatCompletionRequest {

        private List<Message> messages;
        private String model;
        private boolean logprobs;
        private int top_logprobs;

        public List<Message> getMessages() {
                return messages;
        }

        public void setMessages(List<Message> messages) {
                this.messages = messages;
        }

        public String getModel() {
               return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public boolean isLogprobs() {
                return logprobs;
        }

        public void setLogprobs(boolean logprobs) {
                this.logprobs = logprobs;
        }

        public int getTop_logprobs() {
                return top_logprobs;
        }

        public void setTop_logprobs(int top_logprobs) {
                this.top_logprobs = top_logprobs;
        }
}

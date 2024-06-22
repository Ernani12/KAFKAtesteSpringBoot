package com.example.kafka.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomMessage {
    
    private String id;
    private String content;

    public CustomMessage() {
    }

    public CustomMessage(String id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CustomMessage{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

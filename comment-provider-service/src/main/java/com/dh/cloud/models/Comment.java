package com.dh.cloud.models;

public class Comment {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Comment() {
    }

    public Comment(String content) {
        this.content = content;
    }
}

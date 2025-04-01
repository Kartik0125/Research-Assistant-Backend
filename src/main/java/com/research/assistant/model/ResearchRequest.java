package com.research.assistant.model;

public class ResearchRequest {
    private String content;
    private String operation;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "ResearchRequest{" +
                "content='" + content + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}

package com.ramy.gatie.portfolio.models.dto;

public class JsonDataDTO {

    private long id;


    private String content;


    public JsonDataDTO(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

package com.ramy.gatie.portfolio.models.dto;

public class Email {

    private String name;
    private String emailAddress;
    private String message;

    public Email(String name, String emailAddress, String message) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

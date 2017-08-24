package com.theironyard.java.inheritance;

import java.time.LocalDateTime;

public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "hello";

    public String showStatus() {
        System.out.println(status);
        return null;
    }


    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public String getSubject() {

        return subject;
    }

    public String getBody() {

        return body;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    public void transport() throws NoTransportException {

    }
}

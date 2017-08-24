package com.theironyard.java.inheritance;

import java.time.LocalDateTime;

public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {

        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "OK";
    }

    protected void printCreation(){
        System.out.printf("The notification was created at %s\n", getCreatedAt());
    }

    public void showStatus() {
        System.out.println(status);
    }

    public String getSubject() {

        return subject;
    }

    public String getStatus() {

        return status;
    }

    public String getBody() {

        return body;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;
    }

    abstract void transport() throws NoTransportException;
}

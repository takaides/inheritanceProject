package com.theironyard.java.inheritance;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider, String status) {
        super(subject, body, status);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }


    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        super.transport();

    }
}

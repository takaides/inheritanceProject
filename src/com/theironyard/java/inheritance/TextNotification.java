package com.theironyard.java.inheritance;

public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        printCreation();
    }

    public String getRecipient() {

        return recipient;
    }

    public String getSmsProvider() {

        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.printf(
                "Text Notification: \n" +
                        "Subject: %s\n" +
                        "Body: %s\n" +
                        "Recipient: %s\n" +
                        "SMS Provider: %s\n" +
                        "Status: %s\n" +
                        "At: %s\n",
                getSubject(), getBody(), getRecipient(), getSmsProvider(), getStatus(), getCreatedAt());
    }
}

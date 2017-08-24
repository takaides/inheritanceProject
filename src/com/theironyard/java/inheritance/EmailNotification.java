package com.theironyard.java.inheritance;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "Unreceived";
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.printf(
                "Email Notification: \n" +
                        "Subject: %s\n" +
                        "Body: %s\n" +
                        "Recipient: %s\n" +
                        "SMTP Provider: %s\n" +
                        "Status: %s\n" +
                        "At: %s\n",
                getSubject(), getBody(), getRecipient(), getSmtpProvider(), getStatus(), getCreatedAt());
    }

    @Override
    public void printCreation() {
        super.printCreation();
        System.out.printf("It will be sent using %s", getSmtpProvider());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
        return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() {
        return new EmailNotification(getSubject(), getBody(), getRecipient(), getSmtpProvider());
    }
}

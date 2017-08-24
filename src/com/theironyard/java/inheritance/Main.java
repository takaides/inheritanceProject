package com.theironyard.java.inheritance;

public class Main {

    public static void main(String[] args) {

        EmailNotification email = new EmailNotification("stuff", "some things", "fred@company.com", "smtp://mail.google.com");
        TextNotification text = new TextNotification("blank", "There's some stuff here", "+19198675309", "verizon");

        email.transport();
        text.transport();

        email.showStatus();
        text.showStatus();

        email.printCreation();

        Object emailNotificationClone = email.clone();

        emailNotificationClone.equals(email);

    }
}
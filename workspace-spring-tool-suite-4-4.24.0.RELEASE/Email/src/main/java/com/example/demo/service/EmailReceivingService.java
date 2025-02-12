//package com.example.demo.service;
//
//import org.springframework.stereotype.Service;
//
//import jakarta.mail.Folder;
//import jakarta.mail.Message;
//import jakarta.mail.Session;
//import jakarta.mail.Store;
//import jakarta.mail.internet.InternetAddress;
//
//import java.util.Properties;
//
//@Service
//public class EmailReceivingService {
//
//    public String fetchEmails() {
//        Properties properties = new Properties();
//        properties.put("mail.pop3.host", "enterprisemail.in");
//        properties.put("mail.pop3.port", "995"); // Use 995 for SSL
//        properties.put("mail.pop3.ssl.enable", "true"); // Enable SSL/TLS
//
//        final String username = "itech@bminfotradegroup.com";
//        final String password = "je|Et^D9\"0Bl4gS0H0";
//
//        // Create a mail session
//        Session session = Session.getDefaultInstance(properties);
//        StringBuilder emailContent = new StringBuilder();
//
//        try {
//            // Connect to the POP3 store
//            Store store = session.getStore("pop3s");
//            store.connect("enterprisemail.in", username, password);
//
//            // Open the INBOX folder
//            Folder inbox = store.getFolder("INBOX");
//            inbox.open(Folder.READ_ONLY);
//
//            // Fetch messages
//            Message[] messages = inbox.getMessages();
//            for (Message message : messages) {
//                emailContent.append("Subject: ").append(message.getSubject()).append("\n");
//                emailContent.append("From: ").append(InternetAddress.toString(message.getFrom())).append("\n");
//                emailContent.append("Content: ").append(message.getContent().toString()).append("\n\n");
//            }
//
//            // Close the folder and store
//            inbox.close(false);
//            store.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "Error fetching emails: " + e.getMessage();
//        }
//
//        return emailContent.toString();
//    }
//}

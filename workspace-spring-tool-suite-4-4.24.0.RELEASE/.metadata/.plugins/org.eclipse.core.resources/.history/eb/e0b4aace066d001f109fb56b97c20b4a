package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmailService;

@RestController
public class EmailController {

    @Autowired
    private EmailService mailService;

    @GetMapping("thanks")
    public String sendThanksMail() {
        try {
            String to = "recipientemail@gmail.com";
            String subject = "Thank You!";
            String body = "Thanks for using our service!";
            mailService.sendMail(to, subject, body);
            return "Thanks mail sent successfully!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Error while sending mail.";
        }
    }
}


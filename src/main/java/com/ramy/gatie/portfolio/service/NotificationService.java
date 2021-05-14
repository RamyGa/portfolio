package com.ramy.gatie.portfolio.service;

import com.ramy.gatie.portfolio.models.dto.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class NotificationService {

    Logger logger = LoggerFactory.getLogger(NotificationService.class);

    private final JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(Email email) throws MailException {

        SimpleMailMessage mail = new SimpleMailMessage();

        mail.setTo(System.getenv("EMAIL_ADDRESS"));
        mail.setText("From email: "+ email.getEmailAddress()+"\n"+"Name of sender: "+ email.getName()+"\n" + "Message from sender: "+email.getMessage());

        javaMailSender.send(mail);

    }

}

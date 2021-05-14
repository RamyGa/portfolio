package com.ramy.gatie.portfolio.controllers;

import com.ramy.gatie.portfolio.models.dto.Email;
import com.ramy.gatie.portfolio.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class EmailController {

    Logger logger = LoggerFactory.getLogger(EmailController.class);
    private final NotificationService notificationService;

    @Autowired
    public EmailController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    @RequestMapping(value="/send_email", method = RequestMethod.POST)
    @ResponseBody
    public void email(@RequestParam String name, @RequestParam String email, @RequestParam String message) {

        Email email_obj = new Email(name, email, message);

        notificationService.sendEmail(email_obj);


    }

}

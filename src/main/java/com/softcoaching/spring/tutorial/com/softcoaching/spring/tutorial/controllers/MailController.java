package com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.controllers;

import com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.mail.MailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by afilipescu on 3/25/16.
 */


@RestController
public class MailController {
    @Resource
    private MailSender mailSender;
    /*classic way*/
    //private MailSender mailSender = new MockMailSender();

    @RequestMapping("/mail")
    public String sendMail() {
        mailSender.send("adrian.filipescu@gmail.com", "De la mine", "the content");
        return "Mail sent";
    }
}
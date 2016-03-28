package com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.controllers;

import com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.mail.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by afilipescu on 3/25/16.
 */


@RestController
public class MailController {
    /* Resource and Component with a name
    @Resource(name="smtpMailSender")
    */
    //@Resource
    private MailSender mailSender;
    /*classic way*/
    //private MailSender mailSender = new MockMailSender();

    @Autowired
    public MailController (@Qualifier("smtpMS")MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @RequestMapping("/mail")
    public String sendMail() {
        mailSender.send("adrian.filipescu@gmail.com", "De la mine", "the content");
        return "Mail sent";
    }
}
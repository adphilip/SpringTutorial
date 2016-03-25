package com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.mail;

/**
 * Created by afilipescu on 3/25/16.
 */
public interface MailSender {
    void send(String to, String subject, String body);

}

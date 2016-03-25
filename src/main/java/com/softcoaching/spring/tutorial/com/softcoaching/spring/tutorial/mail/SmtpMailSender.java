package com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by afilipescu on 3/25/16.
 */
public class SmtpMailSender implements MailSender {
    private static final Log log = LogFactory.getLog(SmtpMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending SMTP mail to " + to);
        log.info("Subject: " + subject);
        log.info("Body: " + body);
    }
}

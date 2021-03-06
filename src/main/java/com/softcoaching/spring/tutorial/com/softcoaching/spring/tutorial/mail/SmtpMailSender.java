package com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


/**
 * Created by afilipescu on 3/25/16.
 */
@Primary
/**
 * Default name from Component Bean is smtpMailSender
 * WE can change the name of this
 */
@Component("smtpMS")
public class SmtpMailSender implements MailSender {
    private static final Log log = LogFactory.getLog(SmtpMailSender.class);


    //private JavaMailSender javaMailSender;

//    //@Autowired
//    public  void setJavaMailSender(JavaMailSender javaMailSender){
//        this.javaMailSender = javaMailSender;
//    }

    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending SMTP mail to " + to);
        log.info("Subject: " + subject);
        log.info("Body: " + body);
    }
}

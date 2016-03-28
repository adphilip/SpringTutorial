package com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by afilipescu on 3/28/16.
 */

@Configuration
public class MailConfig {

//    @Autowired
//    private JavaMailSender javaMailSender;

    @Bean
    @Profile("dev")
    public MailSender mockMailSender(){
        return new MockMailSender();
    }

    @Bean
    @Profile("!dev")
    //@ConditionalOnProperty(name="spring.mail.host")
    public MailSender smtpMailSender() {
//        SmtpMailSender mailSender = new SmtpMailSender();
//        mailSender.setJavaMailSender(javaMailSender);
//
//        return mailSender;

        return  new SmtpMailSender();
    }
}


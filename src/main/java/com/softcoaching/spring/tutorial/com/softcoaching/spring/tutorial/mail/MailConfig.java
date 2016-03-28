package com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by afilipescu on 3/28/16.
 */

@Configuration
public class MailConfig {

    @Bean
    public MailSender mockMailSender(){
        return new MockMailSender();
    }

    @Bean
    public MailSender smtpMailSender(){
        return new SmtpMailSender();
    }
}


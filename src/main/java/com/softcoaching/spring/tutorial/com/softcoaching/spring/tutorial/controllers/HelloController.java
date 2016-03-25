package com.softcoaching.spring.tutorial.com.softcoaching.spring.tutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by afilipescu on 3/25/16.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello () {
        return "Hello , world from Hello Controller!";
    }
}

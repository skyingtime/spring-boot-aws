package com.controller;

import com.service.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangliu on 11/04/2017.
 */
@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    EmailService emailService;

    @RequestMapping(value = "email/{params}", method = RequestMethod.GET)
    public ResponseEntity sendEmail(@PathVariable String params) {
        String from = "skying.liuyang@gmail.com";
        String to = "Skying_liuyang@hotmail.com";
        String subject = "Test";
        String text = "hello "+ params;
        emailService.sendSimpleMessage(from, to, subject, text);
        return new ResponseEntity("Email has been sent successfully", HttpStatus.OK);
    }
}

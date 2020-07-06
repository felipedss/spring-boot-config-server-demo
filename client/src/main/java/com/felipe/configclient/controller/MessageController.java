package com.felipe.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("message")
@RefreshScope
public class MessageController {

    @Value("${message:Default Message}")
    private String message;

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}

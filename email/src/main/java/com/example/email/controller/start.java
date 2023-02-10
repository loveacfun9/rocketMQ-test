package com.example.email.controller;

import com.example.email.service.consume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class start {

    @Autowired
    private consume consume;

    @GetMapping("/start")
    public void s() throws Exception {
        consume.con();
    }
}

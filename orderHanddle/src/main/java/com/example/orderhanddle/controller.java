package com.example.orderhanddle;

import com.example.orderhanddle.entity.Good;
import com.example.orderhanddle.entity.User;
import com.example.orderhanddle.service.produce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    public produce produce;

    @PostMapping("/produce")
    public void p(String msg) throws Exception {
        produce.pro(msg);
    }
}

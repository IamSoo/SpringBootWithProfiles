package com.day0start.io.profiles.springprofilesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class MasterController {

    @Value("${spring.message}")
    private String message;

    @GetMapping("/hello")
    public String sendMessage(){
        return message;
     }
}

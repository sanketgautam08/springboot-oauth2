package com.sanket.springboot.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String publicEndPoint(){
        return "Welcome to public page";
    }

    @GetMapping("/private")
    public String privateEndPoint(){
        return "Welcome to private page";
    }
}

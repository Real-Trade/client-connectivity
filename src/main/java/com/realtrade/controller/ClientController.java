package com.realtrade.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @RequestMapping("/hello")
    String sayHi(){
        System.out.println("here");
        return "Hi everyone";
    }



    @RequestMapping("/")
    String home(){
        return "Welcome to the home page";
    }
}

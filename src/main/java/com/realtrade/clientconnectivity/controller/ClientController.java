package com.realtrade.clientconnectivity.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @PostMapping("/register")
    public String registerClient(@RequestBody Map<String,String> body){

        System.out.println(body.get("email"));

        String email = body.get("email");

        return "client registered";
    }
}

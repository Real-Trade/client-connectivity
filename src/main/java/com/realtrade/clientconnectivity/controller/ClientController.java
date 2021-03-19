package com.realtrade.clientconnectivity.controller;

import com.realtrade.clientconnectivity.dto.Client;
import com.realtrade.clientconnectivity.services.ClientDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ClientController {

    @Autowired
    ClientDatabaseService clientDatabaseService;



    @RequestMapping("/")
    String home(){
        return "Welcome to the home page";
    }


    @PostMapping("client/register")
    public String registerClient(@RequestBody Client client){
       return clientDatabaseService.register(client);
    }

    @PostMapping("client/login")
    public String loginClient(@RequestBody Client client){
        return clientDatabaseService.login(client.getEmail()) ;
    }
}

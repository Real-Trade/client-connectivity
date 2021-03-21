package com.realtrade.clientconnectivity.controller;

import com.realtrade.clientconnectivity.dto.Client;
import com.realtrade.clientconnectivity.services.ClientDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @Autowired
    ClientDatabaseService clientDatabaseService;

    @RequestMapping("/")
    String home(){
        return "Welcome to the home page";
    }

    @PostMapping("client/register")
    @CrossOrigin("http://localhost:4200")
    public Client registerClient(@RequestBody Client client)throws Exception{
       return clientDatabaseService.register(client);
    }

    @PostMapping("client/login")
    @CrossOrigin("http://localhost:4200")
    public Client loginClient(@RequestBody Client client)throws Exception{
        return clientDatabaseService.login(client.getEmail(),client.getPassword()) ;
    }
}

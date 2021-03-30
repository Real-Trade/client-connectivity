package com.realtrade.clientconnectivity.controller;

import com.realtrade.clientconnectivity.models.Client;
import com.realtrade.clientconnectivity.models.Portfolio;
import com.realtrade.clientconnectivity.services.ClientDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
//@CrossOrigin("http://localhost:4200")
//@CrossOrigin(origins = "https://realtrading.herokuapp.com/",allowedHeaders = {})
public class ClientController {

    @Autowired
    ClientDatabaseService clientDatabaseService;

    @RequestMapping("/")
    String home(){
        return "Welcome to the home page";
    }

    @PostMapping("client/register")
    public Client registerClient(@RequestBody Client client)throws Exception{
        System.out.println(client.toString());
       return clientDatabaseService.register(client);
    }

    @PostMapping("client/login")
    public Client loginClient(@RequestBody Client client)throws Exception{
        return clientDatabaseService.login(client.getEmail(),client.getPassword()) ;
    }

    @PostMapping("client/createPortfolio")
    public Portfolio createPortfolio(@RequestBody Portfolio portfolio) throws Exception{
        return clientDatabaseService.createPortfolio(portfolio);
    }
}

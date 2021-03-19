package com.realtrade.clientconnectivity.services;

import com.realtrade.clientconnectivity.dao.ClientDao;
import com.realtrade.clientconnectivity.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDatabaseService {
@Autowired
    private ClientDao clientDao;

// makes a call to the client repo passing in the email and returning a matching client
    //TODO: clientDao has an exists method, use that instead
public String login(String email){
    if (emailIsValid(email)){
        Client client = new Client();
        client =clientDao.findByEmail(email);
        if (client!= null){
            System.out.println(client);
            return "login successful";
        }
        return "this email is not in our database. Register?";
    }
    else return "error with email field";
}

// logic to validate email field passed from controller
    private boolean emailIsValid(String email) {

    if(email != null ){
        return true;
    }else{
        return false;
    }

    }

    //TODO: handle case where registration is not successful
public String register (Client client){

    if (clientIsValid(client)){
        client.setStatus(0);
        client.setAccountNumber(generateAccountNumber());
        clientDao.save(client);
        return "successful registration";
    }
    return "error with fields passed";
}

//validate registration fields
    private boolean clientIsValid(Client client) {
    if (client.getEmail() != null && client.getFirstname() != null && client.getLastname()!= null && client.getPassword()!= null){
        return true;
    }
    return false;
    }

    //logic to generate account number
    int account =10000;
private int generateAccountNumber(){
  return   account++;
}
}

package com.realtrade.clientconnectivity.services;

import com.realtrade.clientconnectivity.dao.ClientDao;
import com.realtrade.clientconnectivity.dto.Client;
import org.postgresql.util.PSQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientDatabaseService {
@Autowired
    private ClientDao clientDao;

// makes a call to the client repo passing in the email and returning a matching client
    //TODO: clientDao has an exists method, use that instead
public String login(String email){
    Client client = new Client();
    client =clientDao.findByEmail(email);
    if (client!= null){
        System.out.println(client);
        return "login successful";
    }
    return "login unsuccessful";
}

//TODO: handle case where registration is not successful
public String register (Client client){
client.setStatus(0);
client.setAccountNumber(generateAccountNumber());
    clientDao.save(client);
    return "successful registration";
}

//logic to generate account number
    int account =10000;
private int generateAccountNumber(){
  return   account++;
}
}

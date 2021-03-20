package com.realtrade.clientconnectivity.services;

import com.realtrade.clientconnectivity.dao.ClientDao;
import com.realtrade.clientconnectivity.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.realtrade.clientconnectivity.validations.Validations.*;

@Service
public class ClientDatabaseService {
@Autowired
    private ClientDao clientDao;

// makes a call to the client repo passing in the email and returning a matching client
public String login(String email,String password){
    if (loginDetailIsValid(email,password) ){
        Client client = new Client();
        client =clientDao.findByEmail(email);
        //client email is in database
        if (client!= null){
            if (client.getPassword().equals(password)) {
                return "login successful";
            }else {
                return "invalid password";
            }
        }
        return "this email is not in our database. Register?";
    }
    else return "error with login fields";
}




public String register (Client client){
    if (clientIsValid(client)){
        client.setStatus(0);
        client.setAccountNumber(generateAccountNumber());
        clientDao.save(client);
        return "successful registration";
    }
    return "error with fields passed";
}



    //logic to generate account number
    int account =10000;
private int generateAccountNumber(){
  return   account++;
}
}

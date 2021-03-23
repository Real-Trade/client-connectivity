package com.realtrade.clientconnectivity.services;

import com.realtrade.clientconnectivity.dao.ClientDao;
import com.realtrade.clientconnectivity.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.realtrade.clientconnectivity.validations.Validations.*;

@Service
public class ClientDatabaseService {
@Autowired
    private ClientDao clientDao;

// makes a call to the client repo passing in the email and returning a matching client
//public String login(String email,String password){
//    if (loginDetailIsValid(email,password) ){
//        Client client = new Client();
//        client =clientDao.findByEmail(email);
//        //client email is in database
//        if (client!= null){
//            if (client.getPassword().equals(password)) {
//                //TODO: consider implications of returning the object
//                return "login successful";
//            }else {
//                return "invalid password";
//            }
//        }
//        return "this email is not in our database. Register?";
//    }
//    else return "error with login fields";
//}


    public Client login(String email,String password) throws Exception {
    Client client = null;
    if(loginDetailIsValid(email,password)){
        client = clientDao.findByEmailAndPassword(email,password);
    }
    if(client==null){
        throw new Exception("Bad credentials");
    }
        return client;
    }


public Client register (Client client) throws Exception{
    if (clientIsValid(client)){
       if(clientDao.findByEmail(client.getEmail())!=null){
           throw new Exception("user with email "+client.getEmail()+"already exists");
       };
        client.setStatus(0);
        client.setAccountNumber(generateAccountNumber());
        client.setCreated_at(setDate());
        return clientDao.save(client);
    }else{
        System.out.println(client.toString());
        throw new Exception("Bad credentials");
    }
}

    private String setDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    //logic to generate account number
    int account =10000;
private int generateAccountNumber(){
  return   account++;
}
}

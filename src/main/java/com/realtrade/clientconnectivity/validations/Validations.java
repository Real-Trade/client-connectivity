package com.realtrade.clientconnectivity.validations;

import com.realtrade.clientconnectivity.dto.Admin;
import com.realtrade.clientconnectivity.dto.Client;

public abstract class Validations {
    // logic to validate email field passed from controller
    public static boolean loginDetailIsValid(String email, String password) {
        if(email != null && password != null){
            return true;
        }else{
            return false;
        }
    }

    //validate registration fields
    public static boolean clientIsValid(Client client) {
        if (client.getEmail() != null && client.getFirstname() != null && client.getLastname()!= null && client.getPassword()!= null){
            return true;
        }
        return false;
    }
//TODO: refactor both clientIsValid methods into one
    public static boolean clientIsValid(Admin admin) {
        if (admin.getEmail() != null && admin.getFirstname() != null && admin.getLastname()!= null && admin.getPassword()!= null){
            return true;
        }
        return false;
    }
}

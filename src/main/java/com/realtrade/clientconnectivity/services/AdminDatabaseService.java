package com.realtrade.clientconnectivity.services;

import com.realtrade.clientconnectivity.dao.AdminDao;
import com.realtrade.clientconnectivity.dto.Admin;
import com.realtrade.clientconnectivity.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.realtrade.clientconnectivity.validations.Validations.*;

@Service
public class AdminDatabaseService {

    @Autowired
    private AdminDao adminDao;

    // makes a call to the admin repo passing in the email and returning a matching admin
    public String login(String email,String password){
        if (loginDetailIsValid(email,password) ){
            Admin admin = new Admin();
            admin =adminDao.findByEmail(email);
            //admin email is in database
            if (admin!= null){
                if (admin.getPassword().equals(password)) {
                    return "login successful";
                }else {
                    return "invalid password";
                }
            }
            return "this email is not in our database. Register?";
        }
        else return "error with login fields";
    }

    public String register (Admin admin){
        if(clientIsValid(admin)){
            adminDao.save(admin);
            return "successful registration";
        }
        return "error with fields passed";
    }
}

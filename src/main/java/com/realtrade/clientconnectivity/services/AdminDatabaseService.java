package com.realtrade.clientconnectivity.services;

import com.realtrade.clientconnectivity.dao.AdminDao;
import com.realtrade.clientconnectivity.dto.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDatabaseService {

    @Autowired
    private AdminDao adminDao;

    // makes a call to the admin repo passing in the email and returning a matching admin

    public String login(String email){
        Admin admin = new Admin();
        admin = adminDao.findByEmail(email);
        if (admin!= null){
            return "login successful";
        }
        return "login unsuccessful";
    }

    //TODO: handle case where registration is not successful
    public String register (Admin admin){
        adminDao.save(admin);
        return "successful registration";

    }


}

package com.realtrade.clientconnectivity.services;

import com.realtrade.clientconnectivity.dao.AdminDao;
import com.realtrade.clientconnectivity.dto.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.realtrade.clientconnectivity.validations.Validations.*;

@Service
public class AdminDatabaseService {

    @Autowired
    private AdminDao adminDao;

    // makes a call to the admin repo passing in the email and returning a matching admin
    public Admin login(String email, String password) throws Exception {
        Admin admin = null;
        if(loginDetailIsValid(email,password)){
            admin = adminDao.findByEmailAndPassword(email,password);
        }
        if(admin==null){
            throw new Exception("Bad credentials");
        }
        return admin;
    }

    public Admin register (Admin admin) throws Exception{
        if (clientIsValid(admin)){
            if(adminDao.findByEmail(admin.getEmail())!=null){
                throw new Exception("admin with email "+admin.getEmail()+"already exists");
            };
            return adminDao.save(admin);
        }else{
            throw new Exception("Bad credentials");
        }
    }
}

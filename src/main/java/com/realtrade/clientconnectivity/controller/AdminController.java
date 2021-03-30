package com.realtrade.clientconnectivity.controller;

import com.realtrade.clientconnectivity.models.Admin;
import com.realtrade.clientconnectivity.services.AdminDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminDatabaseService adminDatabaseService;

    @RequestMapping("/admin")
    String admin(){return "hello from admin";}

    @PostMapping("admin/register")
    public Admin registerAdmin(@RequestBody Admin admin)throws Exception {
        return adminDatabaseService.register(admin);
    }

    @PostMapping("admin/login")
    public Admin loginClient(@RequestBody Admin admin)throws Exception {
        return adminDatabaseService.login(admin.getEmail(),admin.getPassword());
    }
}

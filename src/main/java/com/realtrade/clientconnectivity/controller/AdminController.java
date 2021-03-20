package com.realtrade.clientconnectivity.controller;

import com.realtrade.clientconnectivity.dto.Admin;
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
    public String registerAdmin(@RequestBody Admin admin) {
        return adminDatabaseService.register(admin);
    }

    @PostMapping("admin/login")
    public String loginClient(@RequestBody Admin admin) {
        return adminDatabaseService.login(admin.getEmail(),admin.getPassword());
    }
}

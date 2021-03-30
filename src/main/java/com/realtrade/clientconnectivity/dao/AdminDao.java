package com.realtrade.clientconnectivity.dao;

import com.realtrade.clientconnectivity.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin,Integer> {
    Admin findByEmail(String email);
    Admin findByEmailAndPassword(String email, String password);
}

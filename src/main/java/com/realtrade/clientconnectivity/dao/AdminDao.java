package com.realtrade.clientconnectivity.dao;

import com.realtrade.clientconnectivity.dto.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin,Integer> {
    Admin findByEmail(String email);
}

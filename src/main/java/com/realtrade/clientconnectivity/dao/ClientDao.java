package com.realtrade.clientconnectivity.dao;

import com.realtrade.clientconnectivity.dto.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientDao extends JpaRepository<Client,Integer> {

Client findByEmail(String email);

}

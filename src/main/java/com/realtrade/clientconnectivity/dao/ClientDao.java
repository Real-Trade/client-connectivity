package com.realtrade.clientconnectivity.dao;

import com.realtrade.clientconnectivity.dto.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client,Integer> {
Client findByFirstname(String firstname);
}

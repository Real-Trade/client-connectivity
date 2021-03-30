package com.realtrade.clientconnectivity.dao;

import com.realtrade.clientconnectivity.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClientDao extends JpaRepository<Client,Integer> {

Client findByEmail(String email);
Client findByEmailAndPassword(String email,String password);
Client findAllByEmail(String email);

}

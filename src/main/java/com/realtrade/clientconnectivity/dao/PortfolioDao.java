package com.realtrade.clientconnectivity.dao;

import com.realtrade.clientconnectivity.models.Client;
import com.realtrade.clientconnectivity.models.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioDao extends JpaRepository<Portfolio,Integer> {

}

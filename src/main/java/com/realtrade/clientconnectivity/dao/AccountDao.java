package com.realtrade.clientconnectivity.dao;

import com.realtrade.clientconnectivity.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDao extends JpaRepository<Account,Integer> {
}

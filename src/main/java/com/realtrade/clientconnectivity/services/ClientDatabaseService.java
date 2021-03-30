package com.realtrade.clientconnectivity.services;

import com.realtrade.clientconnectivity.dao.AccountDao;
import com.realtrade.clientconnectivity.dao.ClientDao;
import com.realtrade.clientconnectivity.dao.PortfolioDao;
import com.realtrade.clientconnectivity.models.Account;
import com.realtrade.clientconnectivity.models.Client;
import com.realtrade.clientconnectivity.models.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static com.realtrade.clientconnectivity.validations.Validations.*;

@Service
public class ClientDatabaseService {
 static int Balance= 10000;
    @Autowired
    private ClientDao clientDao;

    @Autowired
    private PortfolioDao portfolioDao;

    @Autowired
    private AccountDao accountDao;

    public Client login(String email,String password) throws Exception {
    Client client = null;
    if(loginDetailIsValid(email,password)){
        client = clientDao.findByEmailAndPassword(email,password);
    }
    if(client==null){
        throw new Exception("Bad credentials");
    }
        return client;
    }


    public Client register (Client client) throws Exception{
    if (clientIsValid(client)){
       if(clientDao.findByEmail(client.getEmail())!=null){
           throw new Exception("user with email "+client.getEmail()+"already exists");
       };
        client.setStatus(0);
        Account account = new Account(Balance);
        account.setClient(client);
        Client client1  =clientDao.save(client);
        accountDao.save(account);
        return client1;
    }else{
        throw new Exception("Bad credentials");
    }
}

    public Portfolio createPortfolio(Portfolio portfolio) throws Exception {
    if(portfolioFieldIsValid(portfolio)){

        return portfolioDao.save(portfolio);
    }else{
        throw new Exception("Bad fields");
    }
    }


}

package com.realtrade.clientconnectivity;

import com.realtrade.clientconnectivity.dao.ClientDao;
import com.realtrade.clientconnectivity.dto.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication

public class ClientConnectivityApplication implements CommandLineRunner  {

	@Autowired
	ClientDao dao;

	public static void main(String[] args) {
		SpringApplication.run(ClientConnectivityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(dao.findAll());
//		System.out.println(dao.findByFirstname("Nii"));
	}
}

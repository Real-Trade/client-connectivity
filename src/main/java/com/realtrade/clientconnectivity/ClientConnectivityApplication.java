package com.realtrade.clientconnectivity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ClientConnectivityApplication {

	@RequestMapping("/")
	@ResponseBody
	String home (){
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientConnectivityApplication.class, args);
	}



}

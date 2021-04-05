package com.taoyee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class ConfigServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ConfigServer.class, args);
	}

}

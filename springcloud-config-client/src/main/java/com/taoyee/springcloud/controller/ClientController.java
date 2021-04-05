package com.taoyee.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Value("${spring.application.name}")
	private String applicationName;
	
	@Value("${server.port}")
	private String serverPort;
	@RequestMapping("/config")
	public String getGithubConfig() {
		String info="applicationName=>"+applicationName+"\t serverPort=>"+serverPort;
		System.out.println(info);
		return info;
	}

}

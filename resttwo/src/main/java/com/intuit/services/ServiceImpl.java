package com.intuit.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ServiceImpl implements IService{

	@Value("${server.port}")
	private String port;
	
	@Value("${greeting.value}")
	private String msg;
		
	@Override
	public String getGreeting() {

		return "Port: " + port + " " + msg;
	}

	
}

package com.intuit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Component
@RefreshScope
public class ServiceImpl implements IService{

	@Autowired
	GreetingClient client;
	
	@Value("${message}")
	private String msg;
	
	@Override
	//HystrixCommand(fallbackMethod="problem")
	public String getGreeting() {
		
		return msg + " -> " + client.greet();
		//return new RestTemplate().getForEntity("http://localhost:8081/greet", String.class).getBody();
	}
	
	public String problem() {
		return "Bad things are happening in restone";
	}
}
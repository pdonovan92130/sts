package com.intuit;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.services.IService;

@RestController
public class MyRestController {

	@Autowired
	private IService svc;
	
	@RequestMapping("/greet")
	public String m1()
	{
		return svc.getGreeting();
	}
}

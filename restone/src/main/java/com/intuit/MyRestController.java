package com.intuit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.services.IService;

@RestController
public class MyRestController {

	static final Log log = LogFactory.getLog(MyRestController.class);
	
	@Autowired
	private IService svc;
	
	@Autowired
	private TPSHealth health;
	
	@RequestMapping("/greet")
	public String m1()
	{
		log.debug("Debug statement yo");
		health.updateTx();
		
		return svc.getGreeting();
	}
}

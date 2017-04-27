package com.intuit;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class SimpleFilter extends ZuulFilter {
	
	private static Logger log = Logger.getLogger(SimpleFilter.class);

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest req = ctx.getRequest();
		
		log.info(String.format("%s request to %s", req.getMethod(), req.getRequestURL()));
		
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}

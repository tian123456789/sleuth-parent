package com.tgr.zuul.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

@Component
public class LoggerFilter extends ZuulFilter {
	
	@Autowired
	private Tracer tracer; 

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		tracer.addTag("operator", "tgr");
		System.out.println(tracer.getCurrentSpan().traceIdString());
		return null;
	}

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 900;
	}

}

package com.lumbah.springdemo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HeaderInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		request.setAttribute("greeting", "We wish all the best in the coming festive season");
		String location = request.getParameter("locationName");
		
		if(location != null) {
			request.setAttribute("locationName", location);
		}
		
		return true;
	}
}

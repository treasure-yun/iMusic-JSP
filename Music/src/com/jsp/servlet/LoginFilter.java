package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
	
	String backUrl;
	
	public void destroy() {
		
	}
	public void init(FilterConfig filterConfig) throws ServletException
	{
		if(filterConfig.getInitParameter("backurl")!=null)
		{
			backUrl=filterConfig.getInitParameter("backurl");
			
		}
		else
			backUrl="index.jsp";
		
	}
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException
    {
		HttpServletRequest httpRequest=(HttpServletRequest)request;
		HttpServletResponse httpResponse=(HttpServletResponse)response;
		HttpSession session=httpRequest.getSession();
		if(session.getAttribute("username")==null)
		{
			httpResponse.sendRedirect(backUrl);
			
		}
		else
			chain.doFilter(request, response);
    }

}

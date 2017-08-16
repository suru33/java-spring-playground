package com.suru.springtest.offers.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class TestFilter
 */
//@WebFilter(urlPatterns = "/*", filterName = "TestFilter")
public class TestFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public TestFilter() {
		System.out.println("filter constructor");
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("filter destroy");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter url: " + ((HttpServletRequest) request).getRequestURI());
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter init: " + fConfig);
	}

}

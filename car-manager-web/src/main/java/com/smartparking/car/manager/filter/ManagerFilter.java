package com.smartparking.car.manager.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smartparking.car.manager.bean.TAuth;

/**
 * Servlet Filter implementation class ManagerFilter
 */
public class ManagerFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ManagerFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		Object attribute = httpRequest.getSession().getAttribute("auth");
		String path = httpRequest.getServletPath();
		System.out.println(path);
		if("/login.jsp".equals(path)||"/login".equals(path)||path.contains(".js")||path.contains(".css"))
			chain.doFilter(request, response);
		else{
			if(attribute instanceof TAuth)
				chain.doFilter(request, response);
			else
				httpResponse.sendRedirect(httpRequest.getContextPath()+"/login.jsp");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

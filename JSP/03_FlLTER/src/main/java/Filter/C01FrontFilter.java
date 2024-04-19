package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/login")
public class C01FrontFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		//request 전 처리
		System.out.println("FrontFilter START ------------");
		chain.doFilter(req, resp);
		//response 후 처리
		System.out.println("FrontFilter END ------------");
		
	}

}

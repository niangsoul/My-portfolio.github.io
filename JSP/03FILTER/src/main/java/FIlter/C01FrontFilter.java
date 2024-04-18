package FIlter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class C01FrontFilter implements Filter{

	@Override
	public void doFilter(ServletRequest reg, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
		// request 전처리
		System.out.println("FrontFilter START ------------------------");
		chain.doFilter(reg, resp);
		// request 후처리
		System.out.println("FrontFilter END ------------------------");
	}
	
}

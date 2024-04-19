package Listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class C05RequestListener implements ServletRequestListener{
	  @Override
	    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
		  // (p) 요청시작시 호출되는 메서드
	        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
	        System.out.println("요청 시작: " + request.getRequestURI());
	    }

	    @Override
	    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
	    // (p) 요청이 종료될떄 호출되는 메서드
	        HttpServletRequest request = (HttpServletRequest) servletRequestEvent.getServletRequest();
	        System.out.println("요청 종료: " + request.getRequestURI());
	    }
}

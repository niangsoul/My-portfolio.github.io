package Listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class C06RequestAttributeListener implements ServletRequestAttributeListener{
	
	  @Override
	    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
		// (p) 요청시작시 호출되는 메서드
	        HttpServletRequest request = (HttpServletRequest) servletRequestAttributeEvent.getServletRequest();
	        System.out.println("ServletRequestAttributeListener 속성 추가: " + servletRequestAttributeEvent.getName() + " = " + servletRequestAttributeEvent.getValue() +
	                " (요청: " + request.getRequestURI() + ")");
	    }

	    @Override
	    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
	    	// (p) 요청이 종료될떄 호출되는 메서드
	        HttpServletRequest request = (HttpServletRequest) servletRequestAttributeEvent.getServletRequest();
	        System.out.println("ServletRequestAttributeListener 속성 제거: " + servletRequestAttributeEvent.getName() + " (요청: " + request.getRequestURI() + ")");
	    }

	    @Override
	    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
	        HttpServletRequest request = (HttpServletRequest) servletRequestAttributeEvent.getServletRequest();
	        System.out.println("ServletRequestAttributeListener 속성 대체: " + servletRequestAttributeEvent.getName() + " = " + servletRequestAttributeEvent.getValue() +
	                " (요청: " + request.getRequestURI() + ")");
	    }
}

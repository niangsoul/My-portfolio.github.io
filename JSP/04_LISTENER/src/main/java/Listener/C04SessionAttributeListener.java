package Listener;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


@WebListener
public class C04SessionAttributeListener implements HttpSessionAttributeListener{

	  @Override
	    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("HttpSessionAttributeListener 속성 추가: " + httpSessionBindingEvent.getName() + " = " + httpSessionBindingEvent.getValue() +
	                " (세션: " + httpSessionBindingEvent.getSession().getId() + ")");
	    }

	    @Override
	    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("HttpSessionAttributeListener 속성 제거: " + httpSessionBindingEvent.getName() +
	                " (세션: " + httpSessionBindingEvent.getSession().getId() + ")");
	    }

	    @Override
	    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
	        System.out.println("HttpSessionAttributeListener 속성 대체: " + httpSessionBindingEvent.getName() + " = " + httpSessionBindingEvent.getValue() +
	                " (세션: " + httpSessionBindingEvent.getSession().getId() + ")");
	    }
	    
}

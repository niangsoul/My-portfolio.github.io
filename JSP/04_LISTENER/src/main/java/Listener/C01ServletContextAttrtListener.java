package Listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

//@WebListener의 적용은  web.xml 에서 확인
public class C01ServletContextAttrtListener implements ServletContextAttributeListener
{

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("C01ServletContextAttrtListener's attributeAdded invoke.. ");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("C01ServletContextAttrtListener's attributeRemoved invoke.. ");

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("C01ServletContextAttrtListener's attributeReplaced invoke.. ");

	}

	
}

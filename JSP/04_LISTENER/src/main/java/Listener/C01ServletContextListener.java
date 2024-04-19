package Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class C01ServletContextListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("C01ServletContextListener's contextInitialized invoke..");
		// (p) 서블릿에 속성 추가
		sce.getServletContext().setAttribute("CTX_ATTR1", "CTX_ATTR1_VALUE");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("C01ServletContextListener's contextDestroyed invoke..");

	}


	
	
}

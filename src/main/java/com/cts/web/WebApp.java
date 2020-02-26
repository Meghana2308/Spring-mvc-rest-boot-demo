package com.cts.web;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApp implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext ctx) throws ServletException{
		AnnotationConfigWebApplicationContext webCts = new AnnotationConfigWebApplicationContext();
		webCts.register(SpringWebMvcConfig.class);
		webCts.setServletContext(ctx);
		
		ServletRegistration.Dynamic servlet=ctx.addServlet("dispatcher",new DispatcherServlet(webCts));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
}

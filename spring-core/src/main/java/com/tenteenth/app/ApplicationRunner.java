package com.tenteenth.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.tenteenth.app.configuration.ApplicationConfiguration;
import com.tenteenth.app.domain.Application;

public class ApplicationRunner
{

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Application bean = (Application) context.getBean("applicationBean");
		System.out.println(bean.hello());
		context.close();
	}

}

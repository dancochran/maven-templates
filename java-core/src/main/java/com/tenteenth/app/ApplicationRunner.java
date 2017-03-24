package com.tenteenth.app;

import com.tenteenth.app.domain.Application;
import com.tenteenth.app.domain.ApplicationImpl;

public class ApplicationRunner
{

	public static void main(String[] args) 
	{
		Application app = new ApplicationImpl();
		System.out.println(app.hello());
	}

}

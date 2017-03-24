package com.tenteenth.app.domain;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class ApplicationTest 
{
	private Application app;

	@Before
	public void initialize()
	{
		app = new ApplicationImpl();
	}
	
	@Test
	public void test() throws Exception 
	{
		Assert.assertEquals("Hello World", app.hello());
	}
}

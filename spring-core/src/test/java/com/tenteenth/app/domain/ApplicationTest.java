package com.tenteenth.app.domain;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tenteenth.app.configuration.ApplicationConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfiguration.class})
public class ApplicationTest 
{
	@Autowired
	//@Qualifier("applicationBean")
	private Application app;

	@Test
	public void test() throws Exception 
	{
		Assert.assertEquals("Hello World", app.hello());
	}
}

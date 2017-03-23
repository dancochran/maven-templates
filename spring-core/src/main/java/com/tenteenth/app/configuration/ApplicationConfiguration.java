package com.tenteenth.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.tenteenth.app.domain.*;

@Configuration
public class ApplicationConfiguration 
{

	@Bean(name="applicationBean")
	@Description("This is a sample Application Bean")
	public Application application() 
	{
		return new ApplicationImpl();
	}

}
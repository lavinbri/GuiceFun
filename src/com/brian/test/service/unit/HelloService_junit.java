package com.brian.test.service.unit;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.brian.test.service.HelloService;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Class to unit test the HelloService
 *
 */
public class HelloService_junit {
	
	private static HelloService testHelloService;
	
	@BeforeClass
	public static void setUp(){
		
		Injector injector = Guice.createInjector(new TestModule());		
		testHelloService = injector.getInstance(HelloService.class);
	}
	
	@Test
	public void testSayHello(){
		Assert.assertEquals("We say: Testing123", testHelloService.sayHello());
	}
}

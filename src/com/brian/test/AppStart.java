package com.brian.test;

import com.brian.test.service.HelloService;
import com.google.inject.Guice;
import com.google.inject.Injector;


/**
 * Test harness class
 *
 */
public class AppStart {

	/**
	 * Main method creates Service class to say Hello
	 */
	public static void main(String[] args) {
		
		// Create the injector without using a module
		// The default binding is set by the @ImplementedBy on the interface
		Injector injector = Guice.createInjector();
		
		// This statement creates the injector with the module which 
		// means the settings are taken from the bindings there		
		//Injector injector = Guice.createInjector(new HelloModule());
		
		HelloService helloService = injector.getInstance(HelloService.class);
		System.out.println(helloService.sayHello());
	}

}

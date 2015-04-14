package com.brian.test.service;

import com.google.inject.Inject;

/**
 * Main service class to say Hello
 *
 */
public class HelloService {

	@Inject
	private Hello hello;
	
	/**
	 * Public constructor
	 */
	public HelloService(){
		
	}
	
	/**
	 * Says Hello
	 */
	public String sayHello(){		
		return "We say: " + hello.getText();
	}
}

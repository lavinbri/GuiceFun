package com.brian.test;

import com.brian.test.service.Hello;
import com.brian.test.service.IrishHello;
import com.google.inject.AbstractModule;

/**
 * Guice module to set up bindings
 */
public class HelloModule extends AbstractModule {

	@Override
	protected void configure(){

		// Bind to Irish implementation of Hello interface
		bind(Hello.class).to(IrishHello.class);
	}
}

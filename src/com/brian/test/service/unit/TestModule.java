package com.brian.test.service.unit;

import com.brian.test.service.Hello;
import com.google.inject.AbstractModule;

/**
 * Guice module to set up the Test bindings
 *
 */
public class TestModule extends AbstractModule {

	@Override
	protected void configure(){

		// Bind to Test implementation of Hello interface
		bind(Hello.class).to(TestHello.class);
	}
}



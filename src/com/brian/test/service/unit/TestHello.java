package com.brian.test.service.unit;

import com.brian.test.service.Hello;

/**
 * Test implementation of Hello interface
 *
 */
public class TestHello implements Hello {

	@Override
	public String getText() {
		return "Testing123";
	}

}

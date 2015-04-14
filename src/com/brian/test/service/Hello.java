package com.brian.test.service;

import com.google.inject.ImplementedBy;

/**
 * Hello interface which can be implemented in different languages
 *
 */
@ImplementedBy(EnglishHello.class)
public interface Hello {

	// Method to get the text to say hello
	public String getText();
}

package org.jacoco.examples.java.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

	private HelloWorld subject;

	@Before
	public void setup() {
		subject = new HelloWorld();
	}
	
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}

	@Test
	public void testGetMessage_1() {
		assertEquals("Hello Universe!", subject.getMessage(true));
	}
	
}

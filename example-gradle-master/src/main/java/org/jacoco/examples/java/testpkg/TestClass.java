package org.jacoco.examples.java.testpkg;

public class TestClass {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}

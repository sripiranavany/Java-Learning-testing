package com.sripiranavan.java.test.junit;

public class TestCodeCoverageDemo {
	public void testCodeCoverage(String s) {
		if (s == null || s.isEmpty())
			System.out.println("String is empty");
		else
			System.out.println(s);
	}
}
package com.revature.stacklite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelSuiteTest {
	
	//Here is where we will see some examples of parallel testing
	//also a bit more of annotation functionality
	
	//@Parameter annotation holds a reference that is read in the suites-test-testng.xml
	//just another way of inserting parameters into your testsuite

	@Parameters({"test-name"})
	@BeforeTest
	public void beforeTest (String testName) {
		long id = Thread.currentThread().getId();
		System.out.println("BeforeTest thread id is: " + id);
	}
	
	@Parameters({"test-name"})
	@BeforeClass
	public void beforeClass(String testName) {
		long id = Thread.currentThread().getId();
		System.out.println("BeforeClass: " + testName + "  :thread id is: " + id);
		
	}
	
	@Parameters({"test-name"})
	@Test
	public void testMethodOne(String testName) {
		long id = Thread.currentThread().getId();
		System.out.println("Test: " + testName + " :thread id is: " + id);
	}
	
	
	@Parameters({"another-name"})
	@Test
	public void testMethodTwo(String testName) {
		long id = Thread.currentThread().getId();
		System.out.println("Another Test: " + testName + " :thread id is: " + id);
	}
	
	

}

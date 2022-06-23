package com.revature;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelSuiteTest {

    /*
        The @Parameter annotation holds a reference that is read in the test-suite
        so when the test suite is ran, as long as a value is given then there will
        be no exception thrown.

        The test method parameters needs to match the number of paramters in the
        @Parameters annotation, and the order matters too.
    */

	@Parameters({ "test-name" })
	@BeforeTest
	public void beforeTest(String testName) {
		long id = Thread.currentThread().getId();
		System.out.println("Before test " + testName + ". Thread id is: " + id);
	}

    /*
        Shared parameter names will use the same value
    */

	@Parameters({ "test-name" })
	@BeforeClass
	public void beforeClass(String testName) {
		long id = Thread.currentThread().getId();
		System.out.println("Before test-class " + testName + ". Thread id is: "
				+ id);
	}

    /*
        Different parameter names in the annotations will need a different value
        supplied in the test suite
    */

	@Parameters({ "another-name" })
	@Test
	public void testMethodOne(String testName) {
		long id = Thread.currentThread().getId();
		System.out.println("Sample test-method " + testName
				+ ". Thread id is: " + id);
	}

	@Parameters({ "test-name" })
	@AfterClass
	public void afterClass(String testName) {
		long id = Thread.currentThread().getId();
		System.out.println("After test-method  " + testName
				+ ". Thread id is: " + id);
	}

	@Parameters({ "test-name" })
	@AfterTest
	public void afterTest(String testName) {
		long id = Thread.currentThread().getId();
		System.out.println("After test  " + testName + ". Thread id is: " + id);
	}
}

package com.revature.stacklite;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.revature.stacklite.models.Issue;

public class TestIssue {
	Issue newIssue = new Issue();
	
	//Thes are many usefl annotations in testNG: 
	//just a notable few: 
	
	/*
	 * @BeforeTest: run before your first @Test annotation method in your class
	 * @BeforeMethod: runs before every @Test annotated method
	 * @BeforeClass: runs before the first test method in the current class
	 * @BeforeGroups: in testNG you can create a bunch of test into groups through the group attribute used int eh @Test annotatino
	 * thus @BeforeGroups helps to run the defines test first before the specified group of tests is run
	 * 
	 * @After...
	 * 
	 * */
	
	@BeforeSuite
	public void testStart() {
		//this annotated method will be run before all the tests in the suite have run
		//normally this is a place where you could do asny set up your app would need
		//ex: starting up Selenium drivers or web drivers
		
		System.out.println("This is the start of my test suite!!");
		
	}
	
	
	@Test(dataProvider = "test-number", dataProviderClass=DPClass.class)
	public void testSetId (int num) {
		//int testId = 3;
		
		newIssue.setId(num);
		
		Assert.assertEquals(newIssue.getId(), num);
		System.out.println("Set id: " + newIssue.getId() + " | Original number: " + num);
		
	}
	
	@Test(dataProvider = "test-string", dataProviderClass=DPClass.class)
	public void testSetDescription(String description) {
		newIssue.setDescription(description);
		
		Assert.assertEquals(newIssue.getDescription(), description);
		System.out.println("Set description: " + newIssue.getDescription() + " | Original description: " + description);

	}
	
	@Test(dataProvider = "test-issue", dataProviderClass=DPClass.class)
	public void testGetTitle(Issue newIssue) {
		String title = newIssue.getTitle();
		
		Assert.assertEquals(newIssue.getTitle(), title);
		System.out.println("Get title: " + newIssue.getTitle() + " | Original title: " + title);

	}
	
	@AfterTest
	public void endOfClass() {
		//this annotation runs after all your test methods belong to your class have run
		//could also be useful in terms of reporting automation results 
		
		System.out.println("This is the end of my TestIssue class~");
		
	}
	

	

}

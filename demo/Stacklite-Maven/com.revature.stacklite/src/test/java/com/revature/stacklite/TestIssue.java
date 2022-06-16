package com.revature.stacklite;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.revature.stacklite.models.Issue;

public class TestIssue {
	Issue newIssue = new Issue();
	
	@Test(groups = {"include-test-one"})
	public void testSetId () {
		int testId = 3;
		
		newIssue.setId(testId);
		
		Assert.assertEquals(newIssue.getId(), testId);
		
	}
	
}

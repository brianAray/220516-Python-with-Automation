package com.revature.stacklite;

import org.testng.annotations.DataProvider;

import com.revature.stacklite.models.Issue;

public class DPClass {
	
	//DataProvider
	@DataProvider(name="test-number")
	public Object[][] numProvider() {
		return new Object[][] {
			{4}, {5}, {100}, {83}, {3}, {8283}, {0}, {1}
		};
	}
	
	@DataProvider(name = "test-string")
	public Object[][] stringProvider() {
		return new Object[][] {
			{"My computer won't turn on"}, {"My dog chewed through all my cables"}, {"What is testing, someone helpe me!!"}, 
			{"Not a question, just wanna say hi"}
		};
		
	}
	
	@DataProvider(name = "test-issue")
	public Object[][] issueProvider() {
		Issue issue1 = new Issue();
		Issue issue2 = new Issue();
		Issue issue3 = new Issue();
		Issue issue4 = new Issue();
		Issue issue5 = new Issue();
		
		issue1.setTitle("Computer trouble!");
		issue2.setTitle("Maven help");
		issue3.setTitle("What is JUnit?");
		issue4.setTitle("Code doesn't run");
		issue5.setTitle("Help me please!");
		
		return new Object[][] {
			{issue1}, {issue2}, {issue3}, {issue4}, {issue5}
		};

	}
	

}

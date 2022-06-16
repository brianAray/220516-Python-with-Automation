package com.revature.stacklite.ui;

import java.util.Scanner;

import com.revature.stacklite.businesslayer.IIssueBL;
import com.revature.stacklite.models.Issue;

/*
 * Class to present UI to end users to interact with the program
 * 
 * */

public class MainMenu {
	private Scanner myScanner;
	//will use this to get input from the user
	
	private IIssueBL issueBL;
	
	
	//constructor
	
	public MainMenu (Scanner myScanner, IIssueBL issueBL) {
		this.myScanner = myScanner;
		this.issueBL = issueBL;
		
		
	}
	
	//methods
	
	public void start () {
		//method signatures: access mods (optional), non access mods (opt), return type, methodName, arguemnts (opt), throws exceptions (opt)
		//accesss mods: public, private, protected, etc
		//non access mods: static, final, abstract, etc
		
		boolean keepGoing = true; 
		
		do {
			//providing optional actions for the user to take
			System.out.println("Welcome to Stacklite. What do you want to do?");
			System.out.println("[0] Create an issue");
			System.out.println("[1] Get issues");
			System.out.println("[x] Exit");
			
			//capture user input
			String userInput = myScanner.nextLine();
			
			switch (userInput) {
			case "0":
				//create issue
				System.out.println("Creating an issue");
				
				createIssue();
				
				break;
			case "1":
				//create issue
				System.out.println("Getting all issues...");
				
				getIssues();
				
				break;
			case "x":
				//exit program
				System.out.println("Goodbye");
				//exit do while loop
				keepGoing = false;
				break;
				//need the break otherwise will "fall through: and execute other cases
			default: 
				System.out.println("Wrong input, please try again");
			}
			
			
		}while (keepGoing);
		
		
	}

	private void getIssues() {
		// TODO Auto-generated method stub
		//method to get all issues
		
		for (Issue issue: issueBL.getIssues()) {
			System.out.println(issue);
		}
		
	}

	//I'm going to keep this private - because this method will only be utilized by my class
	//encapsulation
	private void createIssue() {
		// TODO Auto-generated method stub
		System.out.println("Enter a title for your issue: ");
		String title = myScanner.nextLine();
		
		System.out.println("Enter a description: ");
		String description = myScanner.nextLine();
		
		//creat issue using parameterized constructor
		Issue newIssue = new Issue(title, description);
		//I want to save it to storage
		
		
		issueBL.addIssue(newIssue);
		
		System.out.println(newIssue);
		
	}
}
	
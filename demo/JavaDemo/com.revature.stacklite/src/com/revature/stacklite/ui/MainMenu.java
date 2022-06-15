package com.revature.stacklite.ui;

import java.util.Scanner;

import com.revature.stacklite.businesslayer.IIssueBL;
import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

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
			System.out.println("[2] Add a solution");
			System.out.println("[3] View issue with proposed solution");
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

				System.out.println("Getting all issues...");
				
				getIssues();
				
				break;
			case "2":
				//System.out.println("Getting all issues...");
				
				addSolution();
				
				break;
			case "3":
				//System.out.println("Getting all issues...");
				
				getSpecificIssue();
				
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

	private void addSolution() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the issue you'd like to add a solution to: ");
		String issueId = myScanner.nextLine();
		
		System.out.println("Enter the answer to your proposed solution: ");
		String answer = myScanner.nextLine();
		
		Solution newSolution = new Solution(answer);
		
		try {
			newSolution.setIssueId(Integer.parseInt(issueId));
			issueBL.addSOlution(newSolution);
			
		} catch (NumberFormatException ex) {
			System.out.println("Please only enter numerics");
		} catch (Exception e) {
			System.out.println("No such issue found, try another id");
		}
		
	}

	private void getSpecificIssue() {
		// TODO Auto-generated method stub
		System.out.println("Enter the id of the issue you'd like to view the solutions for: ");
		String issueId = myScanner.nextLine();
		
		Issue foundIssue; 
		
		try {
			foundIssue = issueBL.getIssueById(Integer.parseInt(issueId));
			System.out.println(foundIssue);
			
			for (Solution solution:foundIssue.getSolutions()) {
				System.out.println(solution);
			}
			
		} catch (Exception e1) {
			System.out.println("No such issue found, please try another id");
		}
		
		
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

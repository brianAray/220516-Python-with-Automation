package com.revature.stacklite;

import java.util.Scanner;

import com.revature.stacklite.businesslayer.IssueBL;
import com.revature.stacklite.datalayer.InMemoryRepository;
import com.revature.stacklite.models.Issue;
import com.revature.stacklite.ui.MainMenu;

/*
 * What do I want my project to do: 
 * 
 * View issues
 * submit issues
 * view solutions
 * submit solutions
 * **upvote solutions (nice to have)
 * 
 * 
 * ^Basic CRUD functionality
 * 
 *  What are my models: 
 *  
 *  Issues
 *  Solutions
 * 
 * 
 * 
 * 
 * */


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test our Issue class: 
		//Issue testIssue = new Issue();
		//Issue - datatype
		// new - tells Java to make a new object for the class that follows
		//new keyword is also used to create memory space to store whatever data the constructor will initialize 
		//Issue() calls the contsructor
		
		MainMenu menu = new MainMenu(new Scanner(System.in), new IssueBL(new InMemoryRepository()));
		
		menu.start();
		
		
	}

}

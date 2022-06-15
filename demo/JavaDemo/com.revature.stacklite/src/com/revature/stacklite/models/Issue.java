package com.revature.stacklite.models;

import java.util.List;

//this class is going to be used to model coding issues

public class Issue {
	//what is a class: template for an object
	//members of class: fields (attributes 0 like the characteristics)
					//methods - behavior of the class 
					//constructors 
	
//FIELDS
	private String title;
	private String description;
	private int id;
	private List<Solution> solutions;
	
	
//CONSTRUCTORS
	//what we use to initialize properties of a class
	//example of overloading
	public Issue () {
		//no args constructor 
		
	}
	
	public Issue (String title, String description) {
		this.title = title; 
		this.description = description;
	}
	
	public Issue (String title, String description, int id) {
		//this is constructor chaining
		//can call a constructor within another constructor
		this(title, description);
		this.id = id;
		
	}
	
	public Issue (String title, String description, int id, List<Solution> solutions) {
		this(title, description, id);
		this.solutions = solutions;
	}

	
	
	
//METHODS
	//describing behavior and introducing logic to a class
	
	//getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public List<Solution> getSolutions() {
		return solutions;
	}
	
	public void setSolutions (List<Solution> solutions) {
		this.solutions = solutions;
	}

	
	//example of overriding
	@Override
	public String toString() {
		return "Issue [title=" + title + ", description=" + description + ", id=" + id + "]";
	}
	
	
	
	
	

	
	
	
	

}

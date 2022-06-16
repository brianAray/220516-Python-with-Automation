package com.revature.stacklite.datalayer;

import java.util.ArrayList;
import java.util.List;

import com.revature.stacklite.models.Issue;

//Repo that connects to an inMemory storage - just a static list of issues and solutions

public class InMemoryRepository implements IRepository {
	
	private static List<Issue> listOfIssues;
	private static int latestId;
	
	public InMemoryRepository () {
		listOfIssues = new ArrayList<Issue> () {{
			add(new Issue("Code doesn't work", "My code doesnt' work, I don't know why", 1));
			add(new Issue("Code works?", "My code works, I don't know why", 2));
			
		}};
		
		latestId = 3;
		
	}

	
	@Override
	public void addIssue(Issue newIssue) {
		// TODO Auto-generated method stub
		newIssue.setId(latestId);
		listOfIssues.add(newIssue);
		
		//increment latestId so that every time an issue is added it gets a new 
		//unique id
		latestId++;
		
	}


	@Override
	public List<Issue> getIssues() {
		// TODO Auto-generated method stub
		return listOfIssues;
	}
	
	
	
	
	
}

package com.revature.stacklite.datalayer;

import java.util.ArrayList;
import java.util.List;

import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

//Repo that connects to an inMemory storage - just a static list of issues and solutions

public class InMemoryRepository implements IRepository {
	
	private static List<Issue> listOfIssues;
	private static int latestId;
	private static int latestSolutionId;
	
	
	public InMemoryRepository () {
		listOfIssues = new ArrayList<Issue> () {{
			add(new Issue("Code doesn't work", "My code doesnt' work, I don't know why", 1));
			add(new Issue("Code works?", "My code works, I don't know why", 2));
			
		}};
		
		latestId = 3;
		
		latestSolutionId = 0;
		
	}

	
	@Override
	public void addIssue(Issue newIssue) {
		// TODO Auto-generated method stub
		newIssue.setId(latestId);
		listOfIssues.add(newIssue);
				
		latestId++;
		
	}


	@Override
	public List<Issue> getIssues() {
		// TODO Auto-generated method stub
		return listOfIssues;
	}


	@Override
	public Issue getIssueById(int id) throws Exception {
		// TODO Auto-generated method stub
		Issue foundIssue = null;
		
		for (Issue issue:listOfIssues) {
			
			if (issue.getId() == id) {
				foundIssue = issue;
			}
			
		}
		
		if (foundIssue == null) {
			throw new Exception("Issue not found");
		}
		
		return foundIssue;
	}


	@Override
	public void addSolution(Solution newSolution) throws Exception {
		// TODO Auto-generated method stub
		
		newSolution.setId(latestSolutionId);
		latestSolutionId++;
		
		Issue issue2Update = getIssueById(newSolution.getIssueId());
		List<Solution> existingSolutions = issue2Update.getSolutions();
		
		if (existingSolutions == null) {
			existingSolutions = new ArrayList<Solution>();
		}
		
		existingSolutions.add(newSolution);
		issue2Update.setSolutions(existingSolutions);
		
	}
	
	
	
	
	
}

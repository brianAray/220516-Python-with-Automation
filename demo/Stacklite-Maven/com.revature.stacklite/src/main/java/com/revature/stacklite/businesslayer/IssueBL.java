package com.revature.stacklite.businesslayer;

import java.util.List;

import com.revature.stacklite.datalayer.IRepository;
import com.revature.stacklite.models.Issue;

public class IssueBL implements IIssueBL {
	
	private IRepository repo; 
	
	public IssueBL (IRepository repo) {
		this.repo = repo;
		
	}

	@Override
	public void addIssue(Issue newIssue) {
		// TODO Auto-generated method stub
		repo.addIssue(newIssue);
	}

	@Override
	public List<Issue> getIssues() {
		// TODO Auto-generated method stub
		return repo.getIssues();
	}
	

}

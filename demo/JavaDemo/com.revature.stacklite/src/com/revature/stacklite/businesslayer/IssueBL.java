package com.revature.stacklite.businesslayer;

import java.util.List;

import com.revature.stacklite.datalayer.IRepository;
import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

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

	@Override
	public Issue getIssueById(int id) throws Exception {
		// TODO Auto-generated method stub
		return repo.getIssueById(id);
	}

	@Override
	public void addSOlution(Solution solution) throws Exception {
		// TODO Auto-generated method stub
		repo.addSolution(solution);
	}
	

}

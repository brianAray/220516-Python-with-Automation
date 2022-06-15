package com.revature.stacklite.datalayer;

import java.util.List;

import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

public interface IRepository {
	
	public void addIssue (Issue newIssue);
	
	List<Issue> getIssues();
	
	Issue getIssueById(int id) throws Exception;
	
	void addSolution (Solution newSolution) throws Exception; 
	

}

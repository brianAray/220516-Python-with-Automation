package com.revature.stacklite.datalayer;

import java.util.List;

import com.revature.stacklite.models.Issue;

public interface IRepository {
	
	public void addIssue (Issue newIssue);
	
	List<Issue> getIssues();
	

}

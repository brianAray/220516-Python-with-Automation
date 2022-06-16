package com.revature.stacklite.businesslayer;

import java.util.List;

import com.revature.stacklite.models.Issue;

public interface IIssueBL {
	void addIssue(Issue newIssue);
	
	List<Issue> getIssues();
	

}
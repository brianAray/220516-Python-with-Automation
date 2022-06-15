package com.revature.stacklite.businesslayer;

import java.util.List;

import com.revature.stacklite.models.Issue;
import com.revature.stacklite.models.Solution;

public interface IIssueBL {
	void addIssue(Issue newIssue);
	
	List<Issue> getIssues();
	
	Issue getIssueById(int id) throws Exception;
	
	void addSOlution(Solution solution) throws Exception;
	

}
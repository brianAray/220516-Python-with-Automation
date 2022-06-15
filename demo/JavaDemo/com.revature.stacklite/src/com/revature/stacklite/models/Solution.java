package com.revature.stacklite.models;

/*
 * Solution for people's submitted issues
 * 
 * 
 * */


public class Solution {
//Fields
	private String answer;
	private int id;
	private int upvote; //nice to have 
	private int issueId; 
	
	
//Constructors
	public Solution () {
		
		
	}
	
	//parameterized constructors: 
	public Solution (String answer, int upvote) {
		this.answer = answer;
		this.upvote = upvote;
	}
	
	public Solution (String answer) {
		this.answer = answer;
		this.upvote = 0;
		
	}
	
	public Solution (String answer, int upvote, int id) {
		this(answer, upvote);
		this.id = id;
	}
	
	public Solution (String answer, int upvote, int id, int issueId) {
		this(answer, upvote, id);
		this.issueId = issueId;
	}
	

//Methods
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer (String answer) {
		this.answer = answer;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId (int id) throws Exception {
		if (upvote < 0) {
			throw new Exception("Upvote should only be positive!");
		}
		this.id = id;
	} 
	
	public int getUpvote() {
		return upvote;
	}
	
	public void setUpvote (int upvote) { 
		this.upvote = upvote;
	}
	
	public int getIssueId() {
		return issueId;
	}
	
	public void setIssueId (int issueId) {
		this.issueId = issueId;
	}

	
	@Override
	public String toString() {
		return "Solution [answer=" + answer + ", id=" + id + ", upvote=" + upvote + ", issueId=" + issueId + "]";
	}
	
	
	
	
	
}

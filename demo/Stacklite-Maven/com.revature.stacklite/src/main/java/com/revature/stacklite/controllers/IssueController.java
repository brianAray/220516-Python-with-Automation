package com.revature.stacklite.controllers;

import com.revature.stacklite.businesslayer.IIssueBL;
import com.revature.stacklite.models.Issue;

import io.javalin.http.Handler;

public class IssueController implements IController {

	private IIssueBL issueBL;
	
	public IssueController (IIssueBL issueBL) {
		this.issueBL = issueBL;
	}
	
	//Handler: 
	//it's an interafce - a functional interface for endpoint actions
	//sso we have to use context.result to return data
	
	
	@Override
	public Handler getAll() {
		// TODO Auto-generated method stub
		return ctx -> {
			//converting a java object to json -> marshalling
			ctx.jsonStream(issueBL.getIssues());
		};
	}

	@Override
	public Handler getById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Handler add() {
		// TODO Auto-generated method stub
		//This time we are unmarshalling
		//I want to get the context body (request body) and unmarshall it into an issue type
		//bodyStreamAsClass (bodyAsClass)
		return ctx -> {
			Issue newIssue = ctx.bodyStreamAsClass(Issue.class);
			//transforms the request body as the specified class
			
			try {
				issueBL.addIssue(newIssue);
				ctx.status(201); //201 created
			} catch (Exception e) {
				ctx.status(400);
			} 
			
		};
	}

}

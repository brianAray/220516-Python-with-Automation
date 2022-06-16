package com.revature.stacklite;

import com.revature.stacklite.businesslayer.IssueBL;
import com.revature.stacklite.controllers.IController;
import com.revature.stacklite.controllers.IssueController;
import com.revature.stacklite.datalayer.InMemoryRepository;
import com.revature.stacklite.utils.Router;

import io.javalin.Javalin;

public class RESTDriver {
	//REST - REpresentational State Transfer
	//an architectural style to design your services

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create controller
		IController issueController = new IssueController(new IssueBL(new InMemoryRepository()));
		
		
		//hwo do we start making our javalin app, how do we start explosing http requests
		//we need to start by creating a javain app and making it listen to requests someonwhere
		
		Javalin app = Javalin.create().start(7000);
		//app.get("/", ctx -> {ctx.result("Hello World!!");});
		Router router = new Router(app, issueController);
		router.setUpEndpoints();
		
		
		
		
		
		
		//REST api: 
		//Resources: Issues and Solutions
		//SOlutions need to be associated with issues
		
		//Endpoints: 
		//: /Issues
		//: /Issues
		//: /Issues/{issue_id}/Solutions => getting specific issue with its solutions
		

	}

}

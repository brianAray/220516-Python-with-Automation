package com.revature.stacklite.utils;

import com.revature.stacklite.controllers.IController;

import io.javalin.Javalin;

/*
 * Class in charge of mapping endpoints to the controller methods 
 * tht would handle the http requests
 * this router become technically like a front controller
 * 
 * 
 * */

public class Router {
	private Javalin app; 
	private IController issueController;
	
	public Router (Javalin app, IController issueController) {
		this.app = app;
		this.issueController = issueController;
	}
	
	
	public void setUpEndpoints () {
		// my first route
		app.get("/Issues", issueController.getAll());
		app.post("/Issues", issueController.add());
	}
	
	

}

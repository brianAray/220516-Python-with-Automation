package com.revature.stacklite.controllers;

import io.javalin.http.Handler;

/*
 * Contain the methods that, when implemented, would define 
 * how the controllers handle http requests
 * */

public interface IController {
	//these mthods handle each of our operations
	
	Handler getAll();
	Handler getById();
	Handler add();
	

}

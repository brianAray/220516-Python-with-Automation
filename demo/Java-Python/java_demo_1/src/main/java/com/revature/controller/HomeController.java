package com.revature.controller;

import io.javalin.http.Handler;

public class HomeController {

    public static Handler homepageEntered = ctx -> {
        ctx.redirect("index.html");
    };
    
}

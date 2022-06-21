package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.controller.HomeController;
import com.revature.repository.UserDao;
import com.revature.repository.entities.UserEntity;
import com.revature.util.ConnectionFactory;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create(
            config -> {
                config.addStaticFiles("src/main/resources/public", Location.EXTERNAL);
            }
        );

        app.start(9090);

        app.get("/", HomeController.homepageEntered);
    }
}

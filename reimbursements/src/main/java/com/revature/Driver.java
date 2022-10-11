package com.revature;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Scanner;

import org.eclipse.jetty.http.HttpStatus;

import com.revature.models.Ticket;
import com.revature.models.User;

import io.javalin.Javalin;
import io.javalin.http.Context;


import org.apache.log4j.Logger;

import com.revature.dao.UserDaoImpl;
import com.revature.exceptions.RegisterUserFailedException;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.services.UserService;

public class Driver {
	
	public static void main(String[] args) {
		Javalin app = Javalin.create().start(8000);
		
		app.before(ctx -> {
			System.out.println("This happens before the http requests make it to their final destination.");
		});
		
		// EMPLOYEE GET REQUESTS
		app.get("/employee/{id}/tickets", ctx -> {
			System.out.println("/employee/{id}/tickets Not Yet Implemented!");
		});
		
		app.get("/employee/{id}/pending", ctx -> {
			System.out.println("/employee/{id}/pending /employee/{id}/pending Not Yet Implemented!");
		});
	
		app.get("/employee/{id}/rejected", ctx -> {
			System.out.println("/employee/{id}/rejected /employee/{id}/rejected Not Yet Implemented!");
		});
		
		app.get("/employee/{id}/approved", ctx -> {
			System.out.println("/employee/{id}/approved Not Yet Implemented!");
		});
		
		app.get("/employee/{id}/reimbursements", ctx -> {
			System.out.println("/employee/{id}/reimbursements Not Yet Implemented!");
		});
		
		app.get("/employee/{id}/ticket-types/{type}", ctx -> {
			System.out.println(" /employee/{id}ticket-types/{type} Not Yet Implemented!");
		});
		
		// EMPLOYEE POSTS
		
		app.post("/reimbursement-request", ctx -> {
			System.out.println("/reimbursement-request Not Yet Implemented");
		});
		
		// PROFILE REQUESTS
		
		
		app.get("/user/{id}/profile", ctx -> {
			System.out.println("/user/{id}/profile /user/{id}/profile Not Yet Implemented!");
		});
		
		app.post("/user/{id}/profile", cxt -> {
			System.out.println("/user/{id}/profile Not Yet Implemented");
		});
		
		app.patch("/user/{id}/profile", cxt -> {
			System.out.println("/user/{id}/profile Not Yet Implemented");
		});
		
		app.put("/user/{id}/profile", cxt -> {
			System.out.println("/user/{id}/profile Not Yet Implemented");
		});
		
		app.delete("/user/{id}/profile", cxt -> {
			System.out.println("/user/{id}/profile Not Yet Implemented");
		});
		
		// MANAGER GET REQUESTS
		app.get("/users", ctx -> {
			System.out.println("/users not yet implemented");
			
		});

		app.get("/users/{id}", ctx -> { 
			System.out.println("/users/{id} not yet implemented");

		});

		app.get("/employees", ctx -> {
			System.out.println("/employees not yet implemented");
			
		});

		app.get("/managers", ctx -> {
			System.out.println("/managers not yet implemented");
			
		});
		
		app.get("/tickets", ctx -> {
			System.out.println("/tickets not yet implemented");
			
		});

		app.get("/reimbursements", ctx -> {
			System.out.println("/reimbursements not yet implemented");
			
		});

		app.get("/pending", ctx -> {
			System.out.println("/pending not yet implemented");
			
		});

		app.get("/approved_by/{id}", ctx -> {
			System.out.println("/approved_by/{id} not yet implemented");
			
		});
		
		app.get("/approved", ctx -> {
			System.out.println("/approved not yet implemented");
			
		});

		app.get("/rejected_by/{id}", ctx -> {
			System.out.println("/rejected_by/{id} not yet implemented");
			
		});

		app.get("/rejected", ctx -> {
			System.out.println("/rejected not yet implemented");
			
		});

		// MANAGER PUT REQUESTS
		app.put("/pending/{id}/reject", ctx -> {
			System.out.println("/pending/{id}/reject not yet implemented");

		});

		app.put("/pending/{id}/approve", ctx -> {
			System.out.println("/pending/{id}/approve not yet implemented");

		});

		app.put("/approved/{id}/reimburse", ctx -> {
			System.out.println("/approved/{id}/reimburse not yet implemented");

		});

		//ADMIN PUT REQUESTS
		app.put("users/{id}", ctx -> {
			System.out.println("users/{id} not yet implemented");

		});
	}
}

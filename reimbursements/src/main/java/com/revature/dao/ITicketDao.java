package com.revature.dao;

import java.util.List;

import com.revature.models.State;
import com.revature.models.Ticket;
import com.revature.models.TicketType;
import com.revature.models.User;

/**
 * This outlines the CRUD methods for the Account Objects
 */
public interface ITicketDao {
	
	// Create:
	int insert(Ticket t); //  
	
	// Read:
	List<Ticket> findAll();
	Ticket findById(int id);
	List<Ticket> findByOwner(int id);
	List<Ticket> findByStatus(State status);
	List<Ticket> findByType(TicketType ticketType);
	
	// Update:
	boolean update(State status, Ticket t); // return whether the update was successful
	// or not
	boolean reimburseTicket(Ticket t);
	
}
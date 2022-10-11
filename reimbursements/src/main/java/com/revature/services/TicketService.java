package com.revature.services;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.List;
import java.util.Scanner;

import com.revature.dao.TicketDaoImpl;
import com.revature.dao.ITicketDao;
import com.revature.models.Ticket;
import com.revature.models.TicketType;
import com.revature.models.User;
import com.revature.models.State;

public class TicketService {
	
	private ITicketDao adao;
	
	private static Scanner scan = new Scanner(System.in);
	// The Service layer depends on the Dao to perform crud operations,
	// and adds extra business logic
	
	public TicketService(TicketDaoImpl adaoImpl) {
		this.adao = adaoImpl;
	}
	
	public Ticket submitTicket(User u, String description, double amount, TicketType ticketType) {
		//TODO
		// This not only submits a ticket to the Ticket database
		// but it also adds this ticket to User u's ticket list.
		return null;
	}
	
	public List<Ticket> findByOwner(int userId) {
		return adao.findByOwner(userId);
	}

	
	public Ticket findById(int ticketId) {
		return adao.findById(ticketId);
	}
	
	public List<Ticket> findByStatus(State status) {
		return adao.findByStatus(status);
	}
	
	public List<Ticket> findByType(TicketType ticketType) {
		return adao.findByType(ticketType);
	}
	
	public boolean updateStatus(State status, int ticketId) {
		Ticket t = findById(ticketId);
		return adao.update(status, t);
	}
	
	public boolean reimburseTicket(int ticketId) {
		Ticket t = findById(ticketId);
		return adao.reimburseTicket(t);
	}
	

}

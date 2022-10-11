package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.Ticket;
import com.revature.models.TicketType;
import com.revature.models.User;
import com.revature.models.State;
import com.revature.util.ConnectionUtil;

public class TicketDaoImpl implements ITicketDao{
	
	private static Logger logger = Logger.getLogger(TicketDaoImpl.class);

	@Override
	public int insert(Ticket t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Ticket> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Ticket findById(int id, User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> findByOwner(int id) {
		// TODO Auto-generated method stub
		// Make sure that this will only return info related
		// to the User u, and no other user
		return null;
	}

	@Override
	public List<Ticket> findByStatus(State status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> findByType(TicketType ticketType) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean update(State status, Ticket t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reimburseTicket(Ticket t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
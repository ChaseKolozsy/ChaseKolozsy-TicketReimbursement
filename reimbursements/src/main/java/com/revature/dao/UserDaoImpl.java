package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.revature.models.Ticket;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.util.ConnectionUtil;

public class UserDaoImpl implements IUserDao {

	@Override
	public int insert(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User findByUsername(String username) {
		// This method must scour the tickets table for all tickets
		// belonging to username and add those tickets to 
		// the user's ticket list, which means that all those
		// tickets must be instantiated based on the info inside
		// of the tickets table and then added to the list.
		// also needs to create a temporary table that can be 
		// queried
		return null;
	}

	@Override
	public boolean update(User u) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean updateUserRole(User u, Role role) {
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	


}

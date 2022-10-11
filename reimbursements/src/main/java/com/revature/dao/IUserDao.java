package com.revature.dao;

import java.util.List;

import com.revature.models.User;
import com.revature.models.Role;

/**
 * This outlines the CRUD methods for the User Objects
 */
public interface IUserDao {
	
	// Create:
	int insert(User u); // insert a User Object and return the generated key
	// primary key as an int. 
	
	// Read:
	User findById(int id); // return user object by ID
	User findByUsername(String username);
	
	// Update:
	boolean update(User u); // return whether the update was successful
	// or not
	boolean updateUserRole(User u, Role role);
	
	// Delete:
	boolean delete(int id); // return whether the delete was successful or not
	

	

}
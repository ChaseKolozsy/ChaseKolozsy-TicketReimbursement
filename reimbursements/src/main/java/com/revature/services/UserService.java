package com.revature.services;

import org.apache.log4j.Logger;

import com.revature.dao.IUserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.exceptions.RegisterUserFailedException;
import com.revature.models.User;
import com.revature.models.Role;
import com.revature.models.State;
import com.revature.models.Ticket;
import com.revature.models.TicketType;

import java.util.List;

public class UserService {
	
	private static Logger logger = Logger.getLogger(UserService.class);
	private IUserDao udao;
	
	public UserService(UserDaoImpl udaoImpl) {
		this.udao = udaoImpl;
	}
	
	// Until I figure out how to use Auth0 here, this will be my strategy
	public User register(User u) {
		
		// extract the username first
		String username = u.getUsername();
		
		// TO check that the user DOESN'T exist, call findUserByUsername() method and see what it returns
		User possibleUser = udao.findByUsername(username); // this now returns either an empty User object OR the fully initialized User object
		
		// does it exist already? Run some checks on its ID. As is possibleUser's ID > 0 or == 0?
		if (possibleUser.getId() == 0) { // this means that the user doesn't exist in the DB and we can register it
			
			logger.info("successfully registered user with username " + username);
			int id = udao.insert(u); // are you maintaining the integrity of the data returned?
			
			u.setId(id);
			return u; // return the user after its ID has been assigned.
			
		} else {
			
			throw new RegisterUserFailedException("Failed to register user because id was not 0");

			// logger.info("User with username " + username + " already exists");
//			// return the User object found instead of re-inserting it
//			return possibleUser;
		}
	}
	
	// login(String username, String password) method
	public User login(String username, String password) {
		
		// first fetch a User object from the DB by calling udao.findByUsername(username)
		User returnedUser = udao.findByUsername(username);
		
		// then check that that User's password is == to the password passed to this method
		if (returnedUser.getPwd().equals(password)) { // look into memory address of string returned from DB, and password returned from getPwd();
			logger.info("Successfully logged in the user with username " + username);
			return returnedUser;
		}
		
		// IF the above if-statement returns false, then we return null and log that the password and username combo was incorrect
		logger.info("password and username combination for user" + username + " was incorrect");
		return null;
	}
	
	public boolean updateUserRole(User u, Role role) {
		User userToUpdate = udao.findById(u.getId());
		return udao.updateUserRole(userToUpdate, role);
	}
	
	public List<Ticket> ticketsByStatus(List<Ticket> userTickets, State status) {
		// TODO
		// Returns a list of all the user's tickets by status using list operations
		return null;
	}
	
	public List<Ticket> ticketsByType(List<Ticket> userTickets, TicketType type) {
		// TODO
		// Returns a list of all the user's tickets by ticket type using list operations
		return null;
	}
	
	public List<Ticket> ticketsByStatusAndType(User u, State status, TicketType type) {
		// TODO
		// Returns a list of all the user's tickets filtered first by status then by type
		// using sql commands
		return null;
	}
	

}

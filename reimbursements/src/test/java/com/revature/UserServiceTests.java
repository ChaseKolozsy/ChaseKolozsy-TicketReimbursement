package com.revature;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


import com.revature.dao.UserDaoImpl;
import com.revature.exceptions.RegisterUserFailedException;
import com.revature.models.Ticket;
import com.revature.models.TicketType;
import com.revature.models.Role;
import com.revature.models.State;
import com.revature.models.User;
import com.revature.services.UserService;

public class UserServiceTests {
	
	private UserService userv;
	
	private UserDaoImpl mockDao;
	
	private User dummyUser;
	
	@BeforeAll
	public void setup() {
		
		mockDao = mock(UserDaoImpl.class);
		
		userv = new UserService(mockDao);
		
	}
	
	@AfterAll
	public void teardown() {
		
		userv = null;
		mockDao = null;
		dummyUser = null;
		
	}
	
	@Test
	public void testSuccessfulLogin() {
		
		dummyUser = new User(12, "hawkeye", "arrows", Role.Employee, null);
		
		String loginUsername = "hawkeye";
		String loginPassword = "arrows";
		
		when(mockDao.findByUsername(loginUsername)).thenReturn(dummyUser);
		
		User expectedUser = dummyUser;
		User actualReturnedUser = userv.login("hawkey", "arrows");
		
		Assertions.assertEquals(expectedUser, actualReturnedUser);
		
	}
	
	@Test
	public void testFailedLogin() {
		
		dummyUser = new User(12, "hawkeye", "arrows", Role.Employee, null);
		
		String loginUsername = "hawkeye";
		String loginPassword = "balloons";
		
		when(mockDao.findByUsername(loginUsername)).thenReturn(dummyUser);
		
		User actualReturnedUser = userv.login(loginUsername, loginPassword);
		
		Assertions.assertNull(actualReturnedUser);
	}
	
	@Test
	public void testRegisterUser_returnNewPkAsId() {
		
		dummyUser = new User(0, "spongebob", "pass", Role.Employee, null);
		
		Random r = new Random();
		int expectedId = r.nextInt(100); 
		
		when(mockDao.findByUsername(dummyUser.getUsername())).thenReturn(new User());
		
		when(mockDao.insert(dummyUser)).thenReturn(expectedId);
		
		User registeredUser = userv.register(dummyUser);
		int actualId  = registeredUser.getId();
		
		Assertions.assertEquals(expectedId, actualId);
		
	}
        
	@Test
	public void testUpdateUserRole() {
		// TODO
	}
	@Test
	public void testTicketsByStatus() { 
		// TODO
	}
    @Test	
	public void testTestTIcketsByType() {
		// TODO
	}
    @Test	
	public void testTicketsByStatusAndType() {
		// TODO
	}

}

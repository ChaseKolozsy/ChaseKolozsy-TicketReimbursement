package com.revature;

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


import com.revature.dao.TicketDaoImpl;
import com.revature.models.Ticket;
import com.revature.models.User;
import com.revature.models.Role;
import com.revature.models.State;
import com.revature.models.TicketType;
import com.revature.services.TicketService;


public class TicketServiceTests {
	
	private TicketService aserv;
	
	private TicketDaoImpl mockDao;
	
	
	@BeforeEach
	public void setup() {
		
		mockDao = mock(TicketDaoImpl.class);
		aserv = new TicketService(mockDao);
		
	}
	
	
	@AfterEach
	public void teardown() {
		
		aserv = null;
		mockDao = null;
		
	}

	@Test
	public void testSubmitTicket() {
		//TODO
	}
	
	@Test
	public void testFindByOwner() {
		//TODO
	}

	@Test
	public void testFindById() {
		//TODO
	}
	
    @Test	
	public void testFindByStatus() {
		//TODO
	}
        
	@Test
	public void testFindByType() {
		//TODO
	}
 
	@Test
	public void testDateStatus() {
		//TODO
	}
	
    @Test
	public void reimburseTicket() {
		//TODO
	}

}

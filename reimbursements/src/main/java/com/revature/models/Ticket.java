package com.revature.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.time.LocalDateTime;


public class Ticket implements Serializable {
	
	private int id;
	private int ticketOwner; 
	private String description;
	private double amount;
	private TicketType ticketType;
	private State status;
	private int updatedBy;
	private boolean isActive;
	private LocalDateTime dateTimeSubmitted;
	
	public Ticket() {
		
	}
	
	public Ticket(int id, int ticketOwner, String description, double amount, TicketType ticketType, int updatedBy,
		LocalDateTime dateTimeSubmitted) {
		super();
		this.id = id;
		this.ticketOwner = ticketOwner;
		this.description = description;
		this.amount = amount;
		this.status = State.Pending;
		this.ticketType= ticketType;
		this.updatedBy = updatedBy;
		this.isActive = true;
		this.dateTimeSubmitted = dateTimeSubmitted;
	}

	public Ticket(int ticketOwner, String description, double amount, TicketType ticketType) {
		super();
		this.ticketOwner = ticketOwner;
		this.description = description;
		this.amount = amount;
		this.ticketType = ticketType;
		this.status = State.Pending;
		this.updatedBy = updatedBy;
		this.isActive = true;
		this.dateTimeSubmitted = dateTimeSubmitted;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public State getStatus() {
		return status;
	}
	public void setStatus(State status) {
		this.status = status;
	}
	public TicketType getTicketType() {
		return ticketType;
	}
	public void setTicketType(TicketType ticketType) {
		this.ticketType = ticketType;
	}
	public int getTicketOwner() {
		return ticketOwner;
	}
	public void setTicketOwner(int ticketOwner) {
		this.ticketOwner = ticketOwner;
	}
	public int getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public LocalDateTime getDateTimeSubmitted() {
		return dateTimeSubmitted;
	}
	public void setDateTimeSubmitted(LocalDateTime dateTimeSubmitted) {
		this.dateTimeSubmitted = dateTimeSubmitted;
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, dateTimeSubmitted, description, id, isActive, ticketOwner, updatedBy);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(dateTimeSubmitted, other.dateTimeSubmitted)
				&& Objects.equals(description, other.description) && id == other.id && isActive == other.isActive
				&& ticketOwner == other.ticketOwner && updatedBy == other.updatedBy;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", ticketOwner=" + ticketOwner + ", description=" + description + ", amount="
				+ amount + ", status=" + status + ", updatedBy=" + updatedBy + ", isActive=" + isActive
				+ ", dateTimeSubmitted=" + dateTimeSubmitted + "]";
	}

	

	
}

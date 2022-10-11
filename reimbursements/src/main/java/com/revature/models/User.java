package com.revature.models;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

	private int id;
	private String username;
	private String pwd;
	private Role role;

	private List<Ticket> tickets;

	public User() {

	}

	public User(int id, String username, String pwd, Role role, List<Ticket> tickets) {
		super();
		this.id = id;
		this.username = username;
		this. pwd = pwd;
		this.role = role;
		this.tickets = tickets;
	}

	public User(String username, String pwd, Role role, List<Ticket> tickets) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.role = role;
		this.tickets = tickets;
	}

	public boolean addTicket(Ticket t) {
		return this.tickets.add(t);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (role != other.role)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pwd=" + pwd + ", role=" + role + "]";
	}
	
}

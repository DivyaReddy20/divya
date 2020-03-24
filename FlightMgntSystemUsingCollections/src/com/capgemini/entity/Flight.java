package com.capgemini.entity;



public class Flight {
	
	String fromloc;
	String toloc;
	int noOfSeats;
	int flightId;
	String flightName;
	String username;
	String password;
	String email;
	public String getFromloc() {
		return fromloc;
	}
	public void setFromloc(String fromloc) {
		this.fromloc = fromloc;
	}
	public String getToloc() {
		return toloc;
	}
	public void setToloc(String toloc) {
		this.toloc = toloc;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Flight(String fromloc, String toloc, int noOfSeats, int flightId, String flightName) {
		super();
		this.fromloc = fromloc;
		this.toloc = toloc;
		this.noOfSeats = noOfSeats;
		this.flightId = flightId;
		this.flightName = flightName;
	}

	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPs() {
		return password;
	}
	public void setPs(String ps) {
		this.password = ps;
	}
	public Flight(String username, String ps, String email) {
		super();
		this.username = username;
		this.password = ps;
		this.email=email;
	}
	public Flight() {
	
	}
	@Override
	public String toString() {
		return "Flight [username=" + username + ", ps=" + password + ", emailId=" + email +"]";
	}
	public String FlightDetails() {
		return "Flight [fromloc=" + fromloc + ", toloc=" + toloc + ", noOfSeats=" + noOfSeats + ", flightId=" + flightId
				+ ", flightName=" + flightName + "]";
	}

	
	}
	
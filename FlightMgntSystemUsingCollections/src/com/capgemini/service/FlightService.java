package com.capgemini.service;


import java.util.List;

import com.capgemini.entity.Flight;


public interface FlightService {

	Flight getAccount(int id);

	 List<Flight> displayFlightDetails();
	Flight getFlights(int id);
	
	
	
}
	
	
package com.capgemini.dao;

import java.util.InputMismatchException;
import java.util.List;


import com.capgemini.entity.Flight;

public interface FlightDao {

	Flight getAccount(int id) throws AccountNotFoundException;
    List<Flight> displayFlightDetails() throws InputMismatchException;
    Flight getFlights(int id);
	

}

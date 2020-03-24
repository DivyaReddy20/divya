package com.capgemini.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.entity.Flight;



public class FlightDaoImpl implements FlightDao{
	static List<Flight> flights;
	static Flight flights1;

	private Map<Integer, Flight> account;
	protected Map<Integer, Flight> getAccountEntry() {
        return account;
    }
	
	   public FlightDaoImpl(){
		   
		  flights = new ArrayList<Flight>();
		 Flight flight1 = new Flight("hyd","delhi",110,78,"indigo");
		  flights.add(flight1);	

		   account = new HashMap<>();
		   Flight account1 = new Flight("preethi","37","p@gmail");
		   account.put(1, account1); 
		   Flight account2 = new Flight("divya","12","d@gmail"); 
           account.put(2, account2);
 	       }
		   
	@Override
	  public List<Flight> displayFlightDetails() {
	    return flights;
	   } 
	@Override
	   public Flight getAccount(int id) {
		    validationCheck(id);
		   return getAccountEntry().get(id);
	     
	   }

	@Override
	public Flight getFlights(int id) {
	
		return flights1;
	} 
	
	 public void validationCheck(final int id) {
	       boolean noExists = getAccountEntry().containsKey(id);
	       
	        if (!noExists) {
	            throw new AccountNotFoundException("No Account found for this number=" + id);
	        }

	    }   
		   
	   }
		  
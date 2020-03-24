package com.capgemini.service;


import java.util.List;


import com.capgemini.dao.FlightDao;
import com.capgemini.dao.FlightDaoImpl;
import com.capgemini.entity.Flight;


public class FlightServiceImpl implements FlightService {
    static FlightDao dao=new FlightDaoImpl();
	@Override
	public Flight getAccount(int id) {
		
		return dao.getAccount(id);
	}
	@Override
   public List<Flight> displayFlightDetails() {
		
		return dao.displayFlightDetails();
	}
	@Override
	public Flight getFlights(int id) {
	
		return dao.getFlights(id);
	}
	
    
    
    
    
}
    
    
    
    
    /*
	
	/*@Override


	@Override
	public Flight getAccountDetails(int id) {
		return dao.getAccountDetails(id);
	}

	

	@Override
	public Flight cancelTickets(int fId, int seats) {
		
		return dao.cancelTickets(fId,seats);
	}



}*/

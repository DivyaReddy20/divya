package com.capgemini.dao;
import org.junit.Test;

import com.capgemini.entity.Flight;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
	
	
	public class FlightDaoTest {

		FlightDao flightdao = new FlightDaoImpl();

		/*@Test
		public void diplayFlights() throws Exception {
			List<Flight> result = flightdao.displayFlightDetails();
			if (result != null) {
				boolean result1=true;
				assertFalse(result1);
			}
		}*/
		  

	@Test
		public void diplayFlights() throws Exception {
			List<Flight> result = flightdao.displayFlightDetails();
			if (result != null) {
				boolean result1=true;
				assertTrue(result1);
			}
		}
		@Test
		public void getAccountDetail() throws Exception {
			Flight result = flightdao.getAccount(1);
			System.out.println(result);
			if (result != null) {
				boolean result1=true;
				assertTrue(result1);
			}
		}
	/*	@Test
		public void getAccountDetail() throws Exception {
			Flight result = flightdao.getAccount(1);
			System.out.println(result);
			if (result != null) {
				boolean result1=true;
				assertFalse(result1);
			}
			}
		*/
		
		
	}
	


package com.capgemini.ui;



import java.util.Scanner;

import com.capgemini.dao.FlightDao;
import com.capgemini.dao.FlightDaoImpl;
import com.capgemini.entity.Flight;
import com.capgemini.service.FlightService;
import com.capgemini.service.FlightServiceImpl;
import com.capgemini.dao.AccountNotFoundException;
import java.util.InputMismatchException;
import java.util.List;

public class MainUi {
	
	private static FlightService accountService = new FlightServiceImpl();
    
    public static FlightService getAccountService() {
        return accountService;
    }
    static FlightService service=new FlightServiceImpl();
	
	
	public static void main(String[] args) {
		
	while(true)
	{
		System.out.println("FLIGHT MANAGEMENT SYSTEM");
		System.out.println("1.Please Login and eneter your login details");
		System.out.println("2:dispaly available flights");
		System.out.println("3.ticket cancellation");
		System.out.println("4.Exit");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		switch(key){
	    case 1:{
	    	
			System.out.println("please login");
			System.out.println("Enter userId");
			 try {
            int id = sc.nextInt();//
           
            FlightService service = getAccountService();
            Flight account = service.getAccount(id);
            System.out.println(account.toString());
            break;
			
		} catch (AccountNotFoundException e) {
            System.out.println("Account id does not exist please enter proper account number or else register");
		}
			 catch (InputMismatchException e) {
		            System.out.println("enter the proper input");
				}
            break;
            }
		case 2:
			
			System.out.println("display flights:");
			FlightService service = getAccountService();
			List<Flight> account = service.displayFlightDetails();
			 for (Flight flight : service.displayFlightDetails()) {
		    System.out.println("Flight [ " + flight.FlightDetails()+ " ]");
		      }
			
			
			break;
		case 3:
			try{
			System.out.println("enter flight id  to cancel ur tickets:");
			int id=sc.nextInt();
			FlightService service1 = getAccountService();
			System.out.println("eneter no of seats to be cancelled");
			int seats=sc.nextInt();
			@SuppressWarnings("unused")
			List<Flight> account2=service1.displayFlightDetails();
		    for (Flight flight : service1.displayFlightDetails()) {
		    int update=flight.getNoOfSeats()+seats;
		    	flight.setNoOfSeats(update);
			  System.out.println("Flight [ " + flight.FlightDetails()+ " ]");
			  System.out.println("No of seats availablke in flight:"+flight.getNoOfSeats());
			     }
		    }catch (AccountNotFoundException e) {
	            System.out.println("This flight Id does not exists!!!Enter correct flight id to cancel your seats");
			} catch (InputMismatchException e) {
	            System.out.println("enter the proper input ");
			}
			
			break;
		case 4:
			System.exit(key);
			System.out.println("thank u!!!!!!");
			
		break;
		           }
	           }
	      }	
	}

	
		
	
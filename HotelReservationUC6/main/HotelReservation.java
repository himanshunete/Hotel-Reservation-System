package com.samplesuc6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	List<Hotel> hotels =  new ArrayList<Hotel>() ;
	public boolean addHotel(String name, int weekDayRate, int weekenedRate, int rating) {		 
        if (hotels.add(new Hotel(name, weekDayRate,  weekenedRate, rating))) {
        	return true ;
        }
		return false ;
	}
	
	public Hotel getCheapestHotel(LocalDate startDate, LocalDate lastDate ) {
		long between = ChronoUnit.DAYS.between(startDate, lastDate) ;
		Hotel cheapest = null ;
		double cheapRate = 0.0 ;
		double hotelRate = 0 ;
		int day = (int)Math.floor(Math.random() * 10) % 2;
		for (Hotel hotel: hotels) {
			if ( day == 0 ) {
			    hotelRate = hotel.getWeekDayRate()*between ;
			} else {
				hotelRate = hotel.getWeekenedRate()*between ;
			}
			if (cheapRate == 0) {
				cheapRate = hotelRate ;
			}
			if (hotelRate <= cheapRate) {
				cheapest = hotel ;
				cheapRate = hotelRate ;
			}
		}
		System.out.println( " CheapestRate is: " + cheapRate );
		System.out.println(" Cheapest Hotel is: " + cheapest.getName() + " with rating " + cheapest.getRating());
		return cheapest;
	}

}

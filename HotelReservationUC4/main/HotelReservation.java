package com.samplesuc3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	List<Hotel> hotels =  new ArrayList<Hotel>() ;
	public boolean addHotel(String name, int weekDayRate, int weekenedRate) {		 
        if (hotels.add(new Hotel(name, weekDayRate,  weekenedRate))) {
        	return true ;
        }
		return false ;
	}
	
//	public Hotel getCheapestHotel(LocalDate startDate, LocalDate lastDate ) {
//		long between = ChronoUnit.DAYS.between(startDate, lastDate) ;
//		Hotel cheapest = null ;
//		double cheapRate = 0.0 ;
//		for (Hotel hotel: hotels) {
//			double hotelRate = hotel.getRate()*between ;
//			if (cheapRate == 0) {
//				cheapRate = hotelRate ;
//			}
//			if (hotelRate <= cheapRate) {
//				cheapest = hotel ;
//				cheapRate = hotelRate ;
//			}
//		}
//		return cheapest;
//	}

}

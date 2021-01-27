package com.samplesuc7;


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
	
	public Hotel getBestRatedHotel(LocalDate startDate, LocalDate lastDate ) {
		long between = ChronoUnit.DAYS.between(startDate, lastDate) ;
		Hotel bestRated = null ;
		double bestRating = 0.0 ;
		double hotelRate = 0;
		for (Hotel hotel: hotels) {
			int day = (int)Math.floor(Math.random() * 10) % 2;
			double hotelRating = hotel.getRating() ;	
			if ( day == 0 ) {
			    hotelRate = hotel.getWeekDayRate()*between ;
			} else {
				hotelRate = hotel.getWeekenedRate()*between ;
			}
			if (bestRating == 0) {
				bestRating = hotelRating ;
			}
			if (hotelRating >= bestRating) {
				bestRated = hotel ;
				bestRating = hotelRating ;
			}
		}
		System.out.println(" Best Rated Hotel " + " with rates " + hotelRate + " is: " + bestRated.getName() + " with rating " + bestRated.getRating());
		return bestRated;
	}

}

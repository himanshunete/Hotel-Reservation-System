package com.samplesuc8;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {
	List<Hotel> hotels =  new ArrayList<Hotel>() ;
	private Scanner scn;
	public boolean addHotel(String name, int weekDayRate, int weekenedRate, int rating) {	
		System.out.println(" Enter Customer Type: ");
		scn = new Scanner(System.in);
		int customerType = scn.nextInt() ;
		int normalCustomer = 0 ;
		int rewardedCustomer = 1 ;
		if ( customerType == normalCustomer ) {
			System.out.println(" Normal Customer:");
            if (hotels.add(new Hotel(name, weekDayRate,  weekenedRate, rating))) {
        	    return true ;
            }
	    }  
		else if ( customerType == rewardedCustomer ){
			System.out.println(" Special Customer:");
            if (hotels.add(new Hotel(name, weekDayRate,  weekenedRate, rating))) {
        	    return true ;
            }
		}
		return false ;
	}
	
//	public Hotel getCheapestHotel(LocalDate startDate, LocalDate lastDate ) {
//		long between = ChronoUnit.DAYS.between(startDate, lastDate) ;
//		Hotel bestRated = null ;
//		double bestRating = 0.0 ;
//		double hotelRate = 0;
//		for (Hotel hotel: hotels) {
//			int day = (int)Math.floor(Math.random() * 10) % 2;
//			double hotelRating = hotel.getRating() ;	
//			if ( day == 0 ) {
//			    hotelRate = hotel.getWeekDayRate()*between ;
//			} else {
//				hotelRate = hotel.getWeekenedRate()*between ;
//			}
//			if (bestRating == 0) {
//				bestRating = hotelRating ;
//			}
//			if (hotelRating >= bestRating) {
//				bestRated = hotel ;
//				bestRating = hotelRating ;
//			}
//		}
//		System.out.println(" Best Rated Hotel " + " with rates " + hotelRate + " is: " + bestRated.getName() + " with rating " + bestRated.getRating());
//		return bestRated;
//	}

}

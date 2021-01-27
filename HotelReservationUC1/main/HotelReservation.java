package com.samples;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
	List<Hotel> hotels =  new ArrayList<Hotel>() ;
	public boolean addHotel(String name, int rate) {		 
        if (hotels.add(new Hotel(name, rate))) {
        	return true ;
        }
		return false ;
	}

}

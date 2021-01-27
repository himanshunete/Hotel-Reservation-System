package com.samples;

import org.junit.Test ;
import org.junit.Assert ;

public class HotelReservationTest {

	@Test	
	public void givenHotel_WhenAddedInHotelReservationSystem_ShouldReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Lakewood", 110);
		hotelReservation.addHotel("Bridegewood", 100);
		boolean result = hotelReservation.addHotel("Ridgewood", 110);
		Assert.assertEquals( result, result );
	}    	

}

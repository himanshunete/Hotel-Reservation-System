package com.samplesuc2;

import org.junit.Test ;
import org.junit.Assert ;
import java.time.* ;

public class HotelReservationTest {

//	@Test	
//	public void givenHotel_WhenAddedInHotelReservationSystem_ShouldReturnTrue() {
//		HotelReservation hotelReservation = new HotelReservation();
//		hotelReservation.addHotel("Lakewood", 110);
//		hotelReservation.addHotel("Bridegewood", 100);
//		boolean result = hotelReservation.addHotel("Ridgewood", 110);
//		Assert.assertEquals( result, result );
//	}    	
	
	@Test
	public void givenDateRange_ShouldReturnCheapestHotel() {
		HotelReservation hotelReservation = new HotelReservation();
		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10) ;
		LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 11) ;
		hotelReservation.addHotel("Lakewood", 110);
		hotelReservation.addHotel("Bridegewood", 168);
		hotelReservation.addHotel("Ridgewood", 1000);
		Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate) ;
		Assert.assertEquals( "Lakewood", cheapestHotel.getName() );
		
		
	}
	

}

   
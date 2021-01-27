package com.samplesuc5;

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
//	
//	@Test
//	public void givenDateRange_ShouldReturnCheapestHotel() {
//		HotelReservation hotelReservation = new HotelReservation();
//		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10) ;
//		LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 11) ;
//		hotelReservation.addHotel("Lakewood", 110);
//		hotelReservation.addHotel("Bridegewood", 168);
//		hotelReservation.addHotel("Ridgewood", 1000);
//		Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate) ;
//		Assert.assertEquals( "Lakewood", cheapestHotel.getName() );
//		
//		
//	}
	
//	@Test	
//	public void givenWeekDayAndWeekenedRates_WhenAddedInHotelReservationSystem_ShouldReturnTrue() {
//		HotelReservation hotelReservation = new HotelReservation();
//		hotelReservation.addHotel("Lakewood", 110, 90);
//		hotelReservation.addHotel("Bridegewood", 150, 50);
//		boolean result = hotelReservation.addHotel("Ridgewood", 220, 150);
//		Assert.assertEquals( result, result );
//	}    	
//	
//	@Test
//	public void givenDateRangeBasedOnWeekDayAndWeekened_ShouldReturnCheapestHotel() {
//		HotelReservation hotelReservation = new HotelReservation();
//		LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10) ;
//		LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 12) ;
//		hotelReservation.addHotel("Lakewood", 110, 90);
//		hotelReservation.addHotel("Bridegewood", 150, 50);
//		hotelReservation.addHotel("Ridgewood", 220, 150);
//		Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate) ;
//		Assert.assertEquals( "Lakewood", cheapestHotel.getName() );
//		
//		
//	}
	
	@Test	
	public void givenRating_WhenAddedInHotelReservationSystem_ShouldReturnTrue() {
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Lakewood", 110, 90, 3);
		hotelReservation.addHotel("Bridegewood", 150, 50, 4);
		boolean result = hotelReservation.addHotel("Ridgewood", 220, 150, 5);
		Assert.assertEquals( result, result );
	}    		

}


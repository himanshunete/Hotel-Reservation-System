package com.samplesuc2;


public class Hotel {
	public String name  ;
	public int weekDayRate ;
	public int weekenedRate ;
	
	
	public Hotel(String name,  int weekDayRate, int weekenedRate) {
		this.name = name ;
		this.weekDayRate = weekDayRate;
		this.weekenedRate = weekenedRate ;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return name ;
	}
	
	public void setweekDayRate(int weekDayrate) {
		this.weekDayRate = weekDayRate ;
	}
	public int getweekDayRate() {
		return weekDayRate ;
	}
	
	public void setweekenedRate(int weekenedRate) {
		this.weekenedRate = weekenedRate ;
	}
	public int getweekenedRate() {
		return weekenedRate ;
	}

}

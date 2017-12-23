package com.jos.dem.tdd;

public class ParkingLot {

	private Integer cars = 0;

  public Boolean isEmpty(){
  	return cars == 0;
  }

  public void park(){
  	cars++;
  }

}

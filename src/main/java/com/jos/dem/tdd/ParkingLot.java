package com.jos.dem.tdd;

public class ParkingLot {

	private static final Integer MAX_CARS = 5;

	private Integer cars = 0;

  public Boolean isEmpty(){
  	return cars == 0;
  }

  public void park(){
  	cars++;
  }

  public void remove(){
  	cars--;
  }

  public Boolean isFull(){
  	return cars >= MAX_CARS;
  }

}

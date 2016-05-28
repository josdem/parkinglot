package com.gonet;

public class ParkingLot {

  private static final int MAX_CAPACITY=5;
  private int cars = 0;

  public boolean isEmpty(){
    return cars==0;
  }

  public boolean isFull(){
    return cars>=MAX_CAPACITY;
  }

  public void park(){
    cars++;
  }

  public void remove(){
    cars--;
  }

}

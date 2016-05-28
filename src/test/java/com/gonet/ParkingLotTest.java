package com.gonet;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;



public class ParkingLotTest {

  private ParkingLot parkingLot = new ParkingLot();

  @Test
  public void shouldKnowIfEmpty(){
    assertTrue(parkingLot.isEmpty());
  }

  @Test
  public void shouldPark(){
    assertTrue(parkingLot.isEmpty());
    parkingLot.park();
    assertFalse(parkingLot.isEmpty());
  }

  @Test
  public void shouldKnowIsFull(){
    for(int i=0; i<5; i++){
      parkingLot.park();
    }
    assertTrue(parkingLot.isFull());
  }

  @Test
  public void shouldRemoveACar(){
    assertTrue(parkingLot.isEmpty());
    parkingLot.park();
    assertFalse(parkingLot.isEmpty());
    parkingLot.remove();
    assertTrue(parkingLot.isEmpty());
  }



}

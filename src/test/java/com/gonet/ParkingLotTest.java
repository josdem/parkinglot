package com.gonet;

import static org.junit.Assert.assertTrue;
import org.junit.Test;



public class ParkingLotTest {

  private ParkingLot parkingLot = new ParkingLot();

  @Test
  public void shouldKnowIfEmpty(){
    assertTrue(parkingLot.isEmpty());
  }
}

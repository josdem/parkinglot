package com.jos.dem.tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ParkingLotTest {

	private ParkingLot parkingLot = new ParkingLot();

	@Test
	public void shouldBeEmpty(){
    assertTrue(parkingLot.isEmpty());
	}

	@Test
	public void shouldPark(){
		parkingLot.park();
		assertFalse(parkingLot.isEmpty());
	}

	@Test
	public void shouldRemove(){
		parkingLot.park();
	  parkingLot.remove();
	  assertTrue(parkingLot.isEmpty());	
	}

}

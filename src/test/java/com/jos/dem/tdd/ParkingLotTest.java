package com.jos.dem.tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ParkingLotTest {

	private static final Integer MAX_CARS = 5;

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

	@Test
	public void shouldFill(){
		fillParkingLot();
		assertTrue(parkingLot.isFull());	
	}

	@Test(expected=RuntimeException.class)
	public void shouldThrowAnException(){
		fillParkingLot();
		parkingLot.park();
	}

	private void fillParkingLot(){
		for(int i=0; i<MAX_CARS; i++){
			parkingLot.park();
		}
	}

}

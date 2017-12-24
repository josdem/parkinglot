package com.jos.dem.tdd;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParkingLotManagerTest {

	private ParkingLotManager manager = new ParkingLotManager();

	@Test
	public void shouldManageParkingLot(){
		ParkingLot parkingLot = mock(ParkingLot.class);
		manager.manage(parkingLot);
		assertEquals(manager.counts(), 1);
	}

}
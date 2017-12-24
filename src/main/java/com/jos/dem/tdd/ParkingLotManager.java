package com.jos.dem.tdd;

import java.util.List;
import java.util.ArrayList;

public class ParkingLotManager {

	private List<ParkingLot> parkingLots = new ArrayList<ParkingLot>();
  
  public void manage(ParkingLot parkingLot){
  	parkingLots.add(parkingLot);
  }

  public int counts(){
  	return parkingLots.size();
  }


}
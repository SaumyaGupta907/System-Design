package ParkingLotSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotSystem {
  List<ParkingSpot> parkingSpotList;
  private Vehicle vehicle;
  private Ticket ticket;
  FeeStrategy feeStrategy;
  ParkingStrategy parkingStrategy;


  public ParkingLotSystem(){
    this.parkingSpotList = new ArrayList<>();
  }

  public ParkingSpot findSpot(Vehicle vehicle){
    return parkingStrategy.findSpot(this, vehicle);
  }

  public void addParkingSpot(ParkingSpot spot){
    parkingSpotList.add(spot);
  }

  public void exitVehicle(Ticket ticket){
    ticket.getSpot().unpark();
    ticket.setExitTime();
  }

  public long calculateFee(Ticket ticket){
    return this.feeStrategy.calculateFee(ticket);
  }


}

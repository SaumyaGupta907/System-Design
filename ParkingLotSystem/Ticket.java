package ParkingLotSystem;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {

  private int ticketId;
  private ParkingSpot spot;
  private Vehicle vehicle;
  private long entryTime;
  private long exitTime = 0;

  public Ticket(int ticketId, ParkingSpot spot, Vehicle vehicle){
    this.ticketId = ticketId;
    this.spot = spot;
    this.vehicle = vehicle;
    this.entryTime = new Date().getTime();
  }

  public ParkingSpot getSpot(){
    return spot;
  }

  public long getEntryTime(){
    return entryTime;
  }

  public void setExitTime(){
    this.exitTime = new Date().getTime();
  }

  public long getExitTime(){
    return this.exitTime;
  }


}

package ParkingLotSystem;

import java.util.HashMap;
import java.util.Map;

public class HourlyFeeStrategy implements FeeStrategy {

  @Override
  public long calculateFee(Ticket ticket) {
    long duration = ticket.getExitTime() - ticket.getEntryTime();

    return (ticket.getSpot().getVehicleSize().getPrice() + duration * 10);
  }
}

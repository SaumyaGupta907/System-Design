package ParkingLotSystem;

import java.util.Date;

public class ParkingLotDemo {
  public static void main(String []args){

    ParkingLotSystem PLS = new ParkingLotSystem();
    int ticketCounter = 1;

    for(int i = 1; i < 6; i++){
      PLS.addParkingSpot(new ParkingSpot(i, VehicleSize.SMALL));
    }
    for(int i = 6; i < 11; i++){
      PLS.addParkingSpot(new ParkingSpot(i, VehicleSize.MEDIUM));
    }
    for(int i = 11; i < 16; i++){
      PLS.addParkingSpot(new ParkingSpot(i, VehicleSize.LARGE));
    }

    Vehicle car = new Car(007);

    PLS.parkingStrategy = new FarthestParkingStrategy();
    PLS.feeStrategy = new HourlyFeeStrategy();

    ParkingSpot spot = PLS.findSpot(car);

    Ticket carTicket = new Ticket(ticketCounter, spot, car);
    ticketCounter += 1;

    try {
      Thread.sleep(5);
      System.out.println("Slept for " + 5 + " ms");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    PLS.exitVehicle(carTicket);
    System.out.println("The fee for your car parking is " + " " + PLS.calculateFee(carTicket));
  }
}

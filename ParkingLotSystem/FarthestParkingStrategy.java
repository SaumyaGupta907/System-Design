package ParkingLotSystem;

public class FarthestParkingStrategy implements ParkingStrategy {
  @Override
  public ParkingSpot findSpot(ParkingLotSystem PLS, Vehicle vehicle) {

    ParkingSpot PS = null;
    for (ParkingSpot spot : PLS.parkingSpotList) {
      if (spot.isAvailable() && spot.getVehicleSize() == vehicle.getSize()) {
        PS = spot;
      }
    }
    System.out.println(PS.getSpotId());
    return PS;
  }
}


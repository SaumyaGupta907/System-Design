package ParkingLotSystem;

public class NearestParkingStrategy implements ParkingStrategy {


  @Override
  public ParkingSpot findSpot(ParkingLotSystem PLS, Vehicle vehicle) {
    for (ParkingSpot spot : PLS.parkingSpotList) {
      if (spot.isAvailable() && spot.getVehicleSize() == vehicle.getSize()) {
        System.out.println(spot.getSpotId());
        return spot;
      }
    }
    System.out.println("No spot available");
    return null;
  }
}

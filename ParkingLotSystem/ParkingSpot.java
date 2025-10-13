package ParkingLotSystem;

public class ParkingSpot {
  private int spotId;
  private VehicleSize vehicleSize;
  private Vehicle vehicle = null;

  public ParkingSpot(int spotId, VehicleSize vehicleSize){
    this.spotId = spotId;
    this.vehicleSize = vehicleSize;
  }

  public VehicleSize getVehicleSize(){
    return this.vehicleSize;
  }

  public void Park(Vehicle vehicle){
    this.vehicle = vehicle;
  }

  public int getSpotId(){
    return this.spotId;
  }

  public Boolean isAvailable(){
    if(this.vehicle == null){
      return true;
    }
    return false;
  }

  public void unpark(){
    this.vehicle = null;
  }


}

package ParkingLotSystem;

public enum VehicleSize {
  SMALL(10),
  MEDIUM(20),
  LARGE(30);

  int val;
  VehicleSize(int val){
    this.val = val;
  }

  public int getPrice(){
    return this.val;
  }
}

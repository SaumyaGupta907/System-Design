package ParkingLotSystem;

public abstract class Vehicle {
  protected int licenseNum;
  protected VehicleSize size;
  public Vehicle(int licenseNum, VehicleSize size){
    this.size = size;
    this.licenseNum = licenseNum;
  }

  public VehicleSize getSize() {
    return size;
  }

  public int getLicenseNum() {
    return licenseNum;
  }
}

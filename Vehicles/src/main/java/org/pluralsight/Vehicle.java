package org.pluralsight;

public class Vehicle {
    private String typeOfVehicle;
    private String vehicleMake;
    private String vehicleModel;
    private String color;
    private int passengerCount;
    private int cargoCapacity;
    private int fuelCapacity;
    private int travelRange;
    private int vehicleYearMade;
    private String vehicleID;
    private int odometer;
    private boolean isElectric;

    public Vehicle(String typeOfVehicle, String vehicleMake, String vehicleModel, String color, int passengerCount, int cargoCapacity, int fuelCapacity, int travelRange, int vehicleYearMade, String vehicleID, int odometer, boolean isElectric) {
        this.typeOfVehicle = typeOfVehicle;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.color = color;
        this.passengerCount = passengerCount;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.travelRange = travelRange;
        this.vehicleYearMade = vehicleYearMade;
        this.vehicleID = vehicleID;
        this.odometer = odometer;
        this.isElectric = isElectric;
    }

    public Vehicle() {
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getTravelRange() {
        return travelRange;
    }

    public void setTravelRange(int travelRange) {
        this.travelRange = travelRange;
    }

    public int getVehicleYearMade() {
        return vehicleYearMade;
    }

    public void setVehicleYearMade(int vehicleYearMade) {
        this.vehicleYearMade = vehicleYearMade;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}

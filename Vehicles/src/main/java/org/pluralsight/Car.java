package org.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;
    private int safetyRating;
    private String carType;

    public int getNumberOfDoors() { return numberOfDoors; }
    public int getSafetyRating() { return safetyRating; }
    public String getCarType() { return carType; }

    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }
    public void setSafetyRating(int safetyRating) { this.safetyRating = safetyRating; }
    public void setCarType(String carType) { this.carType = carType; }
}

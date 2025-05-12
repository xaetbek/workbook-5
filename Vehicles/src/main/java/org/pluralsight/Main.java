package org.pluralsight;

public class Main {
    public static void main(String[] args) {
        Car navigator =  new Car();



        System.out.println(navigator.getTypeOfVehicle() + " " + navigator.getVehicleMake() + " " + navigator.getVehicleModel() + " has a safety rating of " + navigator.getSafetyRating() + " and has " + navigator.getNumberOfDoors() + " doors." + " It was made in " + navigator.getVehicleYearMade() + " and has an odometer reading of " + navigator.getOdometer() + ".");
        System.out.println("It has a cargo capacity of " + navigator.getCargoCapacity() + " and a fuel capacity of " + navigator.getFuelCapacity() + ".");
    }
}
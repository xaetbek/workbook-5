package org.pluralsight;

import java.time.Year;

public class Vehicle extends Asset {
    protected String makeModel;
    protected int year;
    protected int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

//    @Override
//    public double getValue() {
//        double value;
//
//        if (year >= 0 && year <= 3) {
//            value = originalCost * Math.pow(0.97, year);
//        } else if (year >= 4 && year <= 6) {
//            value = originalCost * Math.pow(0.94, year);
//        } else if (year >= 7 && year <= 10) {
//            value = originalCost * Math.pow(0.92, year);
//        } else {
//            value = 1000.00;
//        }
//
//        if (odometer > 100000 &&
//                !makeModel.contains("Honda") &&
//                !makeModel.contains("Toyota")) {
//            value *= 0.75;
//        }
//
//        return value;
//    }

    @Override
    public double getValue() {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        double value;

        if (age <= 3) {
            value = getOriginalCost() * Math.pow(0.97, age);
        } else if (age <= 6) {
            value = getOriginalCost() * Math.pow(0.94, age);
        } else if (age <= 10) {
            value = getOriginalCost() * Math.pow(0.92, age);
        } else {
            value = 1000.00;
        }

        if (odometer > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            value *= 0.75;
        }

        return Math.round(value * 100.0) / 100.0;
    }

    // Getters and Setters
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}

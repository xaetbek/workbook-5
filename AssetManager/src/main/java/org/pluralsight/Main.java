package org.pluralsight;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House myHouse = new House("my house", "01/01/2001", 10000.00, "1310 Turk St.", 1, 100, 200);
        assets.add(myHouse);

        House vacationHouse = new House("vacation house", "12/31/2003", 3000.00, "1227 Northpoint Dr.", 1, 140, 244);
        assets.add(vacationHouse);

        Vehicle myVehicle = new Vehicle("my car", "04/30/2024", 31000.00, "Lincoln Navigator", 2020, 20300);
        assets.add(myVehicle);

        Vehicle rentalVehicle = new Vehicle("rental car", "04/30/2025", 131000.00, "Cadillac Escalade", 2018, 300);
        assets.add(rentalVehicle);

        for (Asset asset : assets) {
            if (asset instanceof House) {
                System.out.println("\nHouse Asset: ");
                System.out.println("This is " + asset.getDescription() + ". I bought it in " + asset.getDateAcquired() +
                        " for the price of $" + String.format("%,.2f", asset.getOriginalCost()) + ". The current value is: $" + String.format("%,.2f", asset.getValue()) + ".");
            }
            if(asset instanceof Vehicle){
                System.out.println("\nVehicle Asset:");
                System.out.println("This is " + asset.getDescription() + ". I acquired it in " + asset.getDateAcquired() +
                        " for the price of $" + String.format("%,.2f",asset.getOriginalCost()) + ". The value as of today is $" + String.format("%,.2f", asset.getValue()) +
                        " \nThe year is " + ((Vehicle) asset).getYear() + " and the manufacturer is " + ((Vehicle) asset).getMakeModel() + ".");
            }
        }
    }
}
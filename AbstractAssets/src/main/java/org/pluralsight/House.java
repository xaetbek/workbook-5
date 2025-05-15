package org.pluralsight;

public class House extends Asset{
    private String address;
    private int condition; //(1 -excellent, 2 -good, 3 -fair, 4 -poor)
    private int squareFoot;
    private int lotSize;

    // Constructor
    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    /**
     * Calculates the current estimated market value of the house.
     *
     * The value is determined based on the house's condition:
     *   - Excellent (1): $180.00 per square foot
     *   - Good (2):      $130.00 per square foot
     *   - Fair (3):      $90.00 per square foot
     *   - Poor (4+):     $80.00 per square foot
     *
     * Additionally, $0.25 is added for each square foot of the lot size.
     *
     * Note: This method does not include the original cost of the house.
     *
     * @return The estimated market value based on condition, square footage, and lot size.
     */
    @Override
    public double getValue() {
        double baseValuePerSqFt;

        if (condition == 1) {
            baseValuePerSqFt = 180.00;
        } else if (condition == 2) {
            baseValuePerSqFt = 130.00;
        } else if (condition == 3) {
            baseValuePerSqFt = 90.00;
        } else {
            baseValuePerSqFt = 80.00;
        }

        return (squareFoot * baseValuePerSqFt) + (lotSize * 0.25);
    }

    // Getters and Setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}

package com.company;

public class Hotel extends CommertialConstruction {
    private int floorQuantity;

    public Hotel(){}

    public Hotel(String address, int squareMeters, int estimatedBuildTime, double costPerSquareMeter, String buildName, int floorQuantity) {
        super(address, squareMeters, estimatedBuildTime, costPerSquareMeter, buildName);
        this.floorQuantity = floorQuantity;
    }
}

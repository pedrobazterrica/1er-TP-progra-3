package com.company;

public class Commerce extends CommertialConstruction {

    private String area;

    public Commerce(){}

    public Commerce(String address, int squareMeters, int estimatedBuildTime, double costPerSquareMeter, String buildName, String area) {
        super(address, squareMeters, estimatedBuildTime, costPerSquareMeter, buildName);
        this.area = area;
    }
}

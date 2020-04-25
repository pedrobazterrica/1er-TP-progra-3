package com.company;

import java.util.List;

//obras domesticas
public class Home extends Construction {

    private int roomQuantity;

    public Home(){}

    public Home(String address, int squareMeters, int estimatedBuildTime, double costPerSquareMeter, int roomQuantity){
        super(address,squareMeters,estimatedBuildTime,costPerSquareMeter);
        this.roomQuantity = roomQuantity;
    }

    @Override
    public String toString(){
        return "Construccion domestica: ";
    }
}

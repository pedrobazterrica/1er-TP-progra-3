package com.company;

import java.util.List;

public abstract class CommertialConstruction extends Construction {
    private String constructionName;

    protected CommertialConstruction(){
    }

    protected CommertialConstruction(String address, int squareMeters, int estimatedBuildTime, double costPerSquareMeter, String buildName){
        super(address, squareMeters, estimatedBuildTime, costPerSquareMeter);
        this.constructionName = buildName;
    }

    @Override
    public String toString(){
        return "Construction name: "+constructionName;
    }

}

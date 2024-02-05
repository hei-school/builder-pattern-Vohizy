package com.example.builderpattern;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SportEngine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
    public void constructSUV(Builder builder){
        builder.reset();
        builder.setSeats(10);
        builder.setEngine("Turbo");
        builder.setTripComputer(true);
        builder.setGPS(true);

    }
}

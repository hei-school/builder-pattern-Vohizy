package com.example.builderpattern;

public class BuilderPatternApplication {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setEngine("sportEngine");
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.result();
        System.out.println(car);
    }

}

package com.example.builderpattern;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int seatNumber) {
        car.setSeats(seatNumber);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(Boolean tripComputer) {
        car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(Boolean GPS) {
        car.setGPS(GPS);
    }
    public Car result(){
        return car;
    }
}

package com.example.builderpattern;

public class CarManualBuilder implements Builder{
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
       manual=new Manual();
    }

    @Override
    public void setSeats(int seatNumber) {
        manual.setSeats(seatNumber);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(Boolean tripComputer) {
        manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(Boolean GPS) {
        manual.setGPS(GPS);
    }
    public Manual result(){
        return manual;
    }
}

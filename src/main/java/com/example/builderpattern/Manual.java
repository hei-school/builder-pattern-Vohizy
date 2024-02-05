package com.example.builderpattern;

public class Manual {
    int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Boolean getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(Boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Boolean getGPS() {
        return GPS;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", GPS=" + GPS +
                '}';
    }

    public void setGPS(Boolean GPS) {
        this.GPS = GPS;
    }

    String engine;
    Boolean tripComputer;
    Boolean GPS;
}

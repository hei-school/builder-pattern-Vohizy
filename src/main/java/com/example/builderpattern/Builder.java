package com.example.builderpattern;

public interface Builder {
    void reset();
    void setSeats(int seatNumber);

    void setEngine(String engine);
    void setTripComputer(Boolean tripComputer);
    void setGPS(Boolean GPS);
}

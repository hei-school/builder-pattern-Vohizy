package com.example.builderpattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderPatternApplicationTests {

    @Test
    void test_new_sport_car(){
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.result();

        assertEquals(Car.class, carBuilder.result().getClass());
        Assertions.assertTrue(carBuilder.result().getTripComputer());
        assertEquals(2, car.getSeats());
    }

    @Test
    void test_manual_from_sport_car(){
        Director director = new Director();
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSUV(carManualBuilder);
        Manual car = carManualBuilder.result();

        assertEquals(10, car.getSeats());
    }


}

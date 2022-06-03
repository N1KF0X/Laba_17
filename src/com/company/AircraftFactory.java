package com.company;

public class AircraftFactory extends Factory{

    @Override
    public Aircraft createTransport(String name) {
        return new Aircraft(name);
    }
}

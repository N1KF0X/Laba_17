package com.company;

public class TruckFactory extends Factory{

    @Override
    public Truck createTransport(String name) {
        return new Truck(name);
    }
}

package com.company;

public class ShipFactory extends Factory{

    @Override
    public Ship createTransport(String name) {
        return new Ship(name);
    }
}

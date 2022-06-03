package com.company;

public class Main {

    public static void main(String[] args) {
        TruckFactory truckFactory = new TruckFactory();
        AircraftFactory aircraftFactory = new AircraftFactory();
        ShipFactory shipFactory = new ShipFactory();
        Truck truck = truckFactory.createTransport("Vasilich");
        Aircraft aircraft = aircraftFactory.createTransport("Vorobey 01");
        Ship ship = shipFactory.createTransport("Lisa");
    }
}

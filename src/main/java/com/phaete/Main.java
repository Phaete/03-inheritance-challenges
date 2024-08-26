package com.phaete;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Seat", "Ibiza", 2005);
        Car car = new Car("Ford", "Mustang", 2023, 3);

        System.out.println(vehicle);
        System.out.println(car);

        // Bonus
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2022, "Sportbike");
        System.out.println(motorcycle);
    }

    /*
    Create another derived class from "Vehicle" called "Motorcycle".
    Add appropriate properties to this class.

    Implement a method in the "Motorcycle" class that returns the type
    of motorcycle (e.g. Chopper, Sportbike, Cruiser).

    Create instances of both "Car" and "Motorcycle" and call the methods
    to output the information.

    Discuss together how inheritance was applied in this scenario and what
    advantages it offers.


     */
}
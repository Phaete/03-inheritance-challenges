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
}
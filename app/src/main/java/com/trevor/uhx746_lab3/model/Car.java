package com.trevor.uhx746_lab3.model;

/**
 * Car Class
 *
 *  implements the Drivable Class.
 *
 *  represents a car in a ShowRoom of Car objects.
 *  each Car object has a make(String), model(String),
 *  year(int), color(String), and a price(double).
 *
 *  implements the start(), stop(), and drive() methods
 *  declared in the Drivable Class.
 */
public class Car implements Drivable {

    // instance variables
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    // Car object constructor
    public Car(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    // simulations of car actions
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void drive(double distance) {
        System.out.println("Car drove " + distance + " miles.");
    }

    // getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    /**
     * @Override
     * toString()
     * @return - string representation of Car's details.
     */
    @Override
    public String toString() {
        return "" + make + " " + model + " is for " + getPrice();
    }
}

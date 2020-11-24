package be.multimedi.softwaretesters.arrays.vehicle;

/**
 * @author Yannick Van Ham
 * created on Tuesday, 24/11/2020
 */
public abstract class Vehicle {
    String colour;
    String brand;
    String model;

    public Vehicle(String colour, String brand, String model) {
        this.colour = colour;
        this.brand = brand;
        this.model = model;
    }
}

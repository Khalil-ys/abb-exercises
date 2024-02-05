package abb.exercises.exercise4.exer3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "528", 2017, "Diesel");

        myCar.speedUp(51.0);
        System.out.println("Current speed: " + myCar.getSpeed());

        myCar.slowDown(10.0);
        System.out.println("Current speed: " + myCar.getSpeed());

        myCar.checkSpeed(40.0);

        myCar.stop();
        System.out.println("Current speed: " + myCar.getSpeed());
    }

    private String brand;
    private String model;
    private int yearOfProduction;
    private String fuelType;
    private double speed;

    public Car(String brand, String model, int yearOfProduction, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
        this.speed = 0;
    }
    public void speedUp(double amount) {
        speed += amount;
    }
    public void slowDown(double amount) {
        if (speed >= amount) {
            speed -= amount;
        } else {
            speed = 0;
        }
    }
    public void stop() {
        speed = 0;
    }
    public void checkSpeed(double speedLimit) {
        if (speed > speedLimit) {
            System.out.println("Warning: You are speeding! Please slow down.");
        } else {
            System.out.println("You are within the speed limit.");
        }
    }
}

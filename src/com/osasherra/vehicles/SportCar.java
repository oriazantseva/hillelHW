package com.osasherra.vehicles;

public class SportCar extends Car {

    private int speed;

    public SportCar(String marka, String carClass, int weightInKg, int speed) {
        super(marka, carClass, weightInKg);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "SportCar {" +
                "brand='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weightInKg=" + weightInKg +
                ", driver=" + driver +
                ", engine=" + engine +
                ", speed=" + speed +
                '}';
    }
}
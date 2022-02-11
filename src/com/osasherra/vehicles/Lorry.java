package com.osasherra.vehicles;

public class Lorry extends Car {

    private int carrying;

    public Lorry(String marka, String carClass, int weightInKg, int carrying) {
        super(marka, carClass, weightInKg);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    @Override
    public String toString() {
        return "Lorry {" +
                "brand='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weightInKg=" + weightInKg +
                ", driver=" + driver +
                ", engine=" + engine +
                ", carrying=" + carrying +
                '}';
    }
}

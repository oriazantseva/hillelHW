package com.osasherra.vehicles;

import com.osasherra.details.Engine;
import com.osasherra.professions.Driver;

public class Car {

    protected String marka;
    protected String carClass;
    protected int weightInKg;
    protected Driver driver;
    protected Engine engine;

    public Car() {
    }

    public Car(String marka, String carClass, int weightInKg) {
        this.marka = marka;
        this.carClass = carClass;
        this.weightInKg = weightInKg;

    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    @Override
    public String toString() {
        return "Car {" +
                "marka='" + marka + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weightInKg=" + weightInKg +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}

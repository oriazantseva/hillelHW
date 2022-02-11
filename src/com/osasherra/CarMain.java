package com.osasherra;

import com.osasherra.details.Engine;
import com.osasherra.professions.Driver;
import com.osasherra.vehicles.Car;
import com.osasherra.vehicles.Lorry;
import com.osasherra.vehicles.SportCar;


public class CarMain {

    public static void main(String[] args) {

        //For test purposes only
        Car car = new Car("Nissan", "X", 2500);
        Driver driver = new Driver("25.09.1973", "Oleksandra R.", 1);
        Engine engine = new Engine(350, "Honda");
        car.setDriver(driver);
        car.setEngine(engine);

        System.out.println(car);
        driver.getAge(driver.getDateOfBirth());
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
        System.out.println("*********************");

        Lorry lorry = new Lorry("Dodge", "X", 5000, 10000);
        Driver lorryDriver = new Driver("25.09.1985", "Andrey K.", 5);
        Engine lorryEngine = new Engine(400, "BMW");
        lorry.setDriver(lorryDriver);
        lorry.setEngine(lorryEngine);

        System.out.println(lorry);
        lorryDriver.getAge(lorryDriver.getDateOfBirth());
        lorry.start();
        lorry.stop();
        lorry.turnLeft();
        lorry.turnRight();
        System.out.println("*********************");

        SportCar sportCar = new SportCar("Lamborghini", "S", 1200, 4000);
        Driver sportCarDriver = new Driver("25.09.1988", "Nataliia R.", 34);
        Engine sportCarEngine = new Engine(600, "Boing");
        sportCar.setDriver(sportCarDriver);
        sportCar.setEngine(sportCarEngine);

        System.out.println(sportCar);
        sportCarDriver.getAge(sportCarDriver.getDateOfBirth());
        sportCar.start();
        sportCar.stop();
        sportCar.turnLeft();
        sportCar.turnRight();

    }
}
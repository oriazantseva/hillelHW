package com.osasherra;

import java.util.ArrayList;
import java.util.List;

public class WarUnitsMain {

    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Wall(1, 1));
        units.add(new Tower(2, 1));

        Soldier soldier = new Soldier(3,4);
        units.add(soldier);

        soldier.fire();
        soldier.move();

        Tank tank = new Tank(5,6);
        units.add(tank);

        tank.fire();
        tank.move();
        tank.reload();

        for (Unit unit : units) {
            System.out.println(unit);
        }
    }
}


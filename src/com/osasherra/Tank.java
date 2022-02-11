package com.osasherra;

public class Tank extends MovableUnit{

    public Tank(int x, int y) {
        super(x, y);
        destructible = true;
    }

    public void reload() {
        System.out.println("Reload!");
    }
}

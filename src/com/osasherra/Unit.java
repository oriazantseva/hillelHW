package com.osasherra;

public class Unit {

    protected int x;
    protected int y;
    protected boolean destructible = false;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isDestructible() {
        return destructible;
    }

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "x=" + x +
                ", y=" + y +
                ", destructible=" + destructible +
                '}';
    }

}

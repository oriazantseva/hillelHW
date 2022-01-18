package com.osasherra;

public class HappyHours {
    private static final int HOURS = 24;
    private static final int MINUTES = 60;

    public static void main(String[] args) {

        getCount1();
        getCount2();

    }

    /* Электронные часы показывают время в формате от 00:00 до 23:59.
    Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
    что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/

    private static void getCount1() {
        StringBuilder Hours = new StringBuilder("00");
        StringBuilder Minutes = new StringBuilder("00");
        StringBuilder temp = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < HOURS; i++) {
            temp.append(i);
            if (i < 10) {
                Hours.replace(1, 2, temp.toString());
            } else {
                Hours.replace(0, 2, temp.toString());
            }
            temp.delete(0, temp.length());

            Hours.reverse();
            for (int j = 0; j < MINUTES; j++) {
                temp.append(j);
                if (j < 10) {
                    Minutes.replace(1, 2, temp.toString());
                } else {
                    Minutes.replace(0, 2, temp.toString());
                }
                temp.delete(0, temp.length());
                if (Hours.toString().equals(Minutes.toString())) {
                    counter++;
                }
            }
            Hours.reverse();
        }
        System.out.println("Version 1: We have " + counter + " coincidences");
    }

    private static void getCount2() {
        int count = 0;
        for (int h = 1; h <= 24; h++) {
            for (int m = 0; m <= 59; m++) {
                if (h / 10 % 10 == m % 10 & h % 10 == m / 10 % 10) {
                    count++;
                }
            }
        }
        System.out.println("Version 2: We have " + count + " coincidences");
    }
}

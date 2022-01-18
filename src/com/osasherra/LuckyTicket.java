package com.osasherra;

public class LuckyTicket {

    public static void main(String[] args) {

        /* Найти количество счастливых билетиков на трамвай от 000001 до 999999 -
        те у которых сумма первых 3 цифр равна сумме последних 3 */

        int count = 0;

        for (int i = 000001; i < 999999; i++) {
            int numb1 = i / 100000 % 10,
                    numb2 = i / 10000 % 10,
                    numb3 = i / 1000 % 10,
                    numb4 = i / 100 % 10,
                    numb5 = i / 10 % 10,
                    numb6 = i % 10;
            if ((numb1 + numb2 + numb3) == (numb4 + numb5 + numb6)) {
                count++;
            }
        }

        System.out.println("Number of lucky tickets: " + count);
    }
}

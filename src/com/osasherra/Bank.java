package com.osasherra;

import java.util.Scanner;

public class Bank {

    /* В банк положили s денег. Какой станет сумма вклада через n лет, если процент 1,5% добавляется к сумме вклада
    ежемесячно. (сложный процент). Написать метод который принимает 2 параметра - s, n и возвращает сумму
    денег на счету.
    */

    public static void main(String[] args) {

        System.out.println("Please enter the principal amount");
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextInt();
        System.out.println("Enter the total loan term");
        double n = scanner.nextInt();
        System.out.println("Sum will be " + getMoneySum(s, n));

    }

    public static double getMoneySum(double s, double n) {
        return s * (Math.pow((1 + (0.015)), n));
    }
}

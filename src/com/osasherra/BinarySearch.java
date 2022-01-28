package com.osasherra;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    /* Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве.
    Входящие параметры: массив и число.
    (считаем что массива который нам передали отсортирован, проверять это не нужно) */


    public static void main(String[] args) {
        int[] array = {1, 8, 34, 67, 9, 6, 78, 12, 56, 41, 90}; // альтерн. задавать рандомный с границами и шагом
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        Arrays.sort(array);

        System.out.println();
        System.out.println("Using binary search iterative : ");
        System.out.println(binarySearchIterative(array, key) ? key + " Found" : key + " Not found");
        System.out.println("Initial array: " + Arrays.toString(array));

    }


    public static boolean binarySearchIterative(int[] array, int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (key < array[middle]) {
                end = middle - 1;
            } else if (key > array[middle]) {
                start = middle + 1;
            } else if (key == array[middle]) {
                return true;
            }
        }
        return false;
    }
}

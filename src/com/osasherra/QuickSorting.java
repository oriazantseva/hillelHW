package com.osasherra;

import java.util.Arrays;
import java.util.Random;

public class QuickSorting {

    /* Метод быстрой сортировки через сравнение */

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = random.ints(10, 0, 20).toArray();
        quicksort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quicksort(int[] a, int left, int right) {
        if (left < right) {
            int position = position(a, left, right);
            quicksort(a, left, position - 1);
            quicksort(a, position, right);
        }
    }

    private static int position(int[] a, int left, int right) {
        int pivot = a[(left + right) / 2];
        while (left <= right) {
            while (a[left] < pivot)
                left++;
            while (a[right] > pivot)
                right--;

            if (left <= right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }

}

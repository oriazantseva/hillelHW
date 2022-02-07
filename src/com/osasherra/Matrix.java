package com.osasherra;

import java.util.Arrays;

public class Matrix {

    /* Написать класс для работы с матрицами (2-мерными массивами), методы:
    print(int[][] matrix) - печатает матрицу
    swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами
    swapRows(int[][] matrix, i, j) - меняет 2 рядка местами
    mul(int[][] matrix, int value) - умножает матрицу на число
    toArray(int[][] matrix) - превращает матрицу в массив. Например если была матрица на 3x4 то вернуть массив из 12 элементов
    max(int[][] matrix) - возвращает максимальный элемент матрицы */

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2}, {3, 2, 10}, {-2, -4, 5}};
        System.out.println("Initial matrix: ");
        MatrixHelper.print(matrix);

        MatrixHelper.swapColumns(matrix, 0, 1);
        System.out.println("New matrix with swapped columns: ");
        MatrixHelper.print(matrix);

        MatrixHelper.swapRows(matrix, 0, 1);
        System.out.println("New matrix with swapped rows: ");
        MatrixHelper.print(matrix);

        MatrixHelper.mul(matrix, 5);
        System.out.println("New matrix x5: ");
        MatrixHelper.print(matrix);

        System.out.println("New array: " + Arrays.toString(MatrixHelper.toArray(matrix)));

        System.out.println("Max value: " + MatrixHelper.max(matrix));
    }

}

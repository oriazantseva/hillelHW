package com.osasherra;

public class MatrixHelper {
    public static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }

    public static void swapColumns(int[][] matrix, int i, int j) {
        for (int index = 0; index < matrix[0].length; index++) {
            int temp = matrix[index][i];
            matrix[index][i] = matrix[index][j];
            matrix[index][j] = temp;
        }
    }

    public static void swapRows(int[][] matrix, int i, int j) {
        int[] temp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = temp;
    }


    public static void mul(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= value;
            }
        }
    }

    public static int[] toArray(int[][] matrix) {
        int[] newArray = new int[matrix.length * matrix[0].length];
        int indexNewArray = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                newArray[indexNewArray] = anInt;
                indexNewArray++;
            }
        }
        return newArray;
    }


    public static int max(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > maxValue) {
                    maxValue = anInt;
                }
            }
        }
        return maxValue;
    }
}

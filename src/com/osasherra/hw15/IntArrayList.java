package com.osasherra.hw15;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] array;

    public IntArrayList(int... values) {
        this.array = new int[values.length];
        System.arraycopy(values, 0, array, 0, array.length);
    }


    @Override
    public void add(int value) {
        int[] tempArray = new int[array.length + 1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        tempArray[tempArray.length - 1] = value;
        array = tempArray;
    }

    @Override
    public int get(int index) {
        if (index > array.length - 1 || index < 0) {
            throw new RuntimeException("Error");
        }
        return array[index];
    }

    @Override
    public void set(int index, int value) {
        if (index > array.length - 1 || index < 0) {
            throw new RuntimeException("Error");
        }
        array[index] = value;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int[] toArray() {
        return array;
    }

    @Override
    public void remove(int index) {
        if (index > array.length - 1 || index < 0) {
            throw new RuntimeException("Error");
        }
        int[] tempArray = new int[array.length - 1];
        System.arraycopy(array, 0, tempArray, 0, index);
        System.arraycopy(array, index + 1, tempArray, index, tempArray.length - index);
        array = tempArray;
    }

    @Override
    public void add(int index, int value) {
        if (index > array.length - 1 || index < 0) {
            throw new RuntimeException("Error");
        }
        int[] tempArray = new int[array.length + 1];
        System.arraycopy(array, 0, tempArray, 0, index);
        System.arraycopy(array, index, tempArray, index + 1, tempArray.length - index - 1);
        tempArray[index] = value;
        array = tempArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntArrayList that = (IntArrayList) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

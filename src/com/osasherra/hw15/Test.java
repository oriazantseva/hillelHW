package com.osasherra.hw15;

/* Реализовать класс IntArrayList который реализует этот интерфейс. В качестве демонстрации с его помощю реализовать
сортировку пузырьком IntList. Логика метода add: создаем временный массив на 1 элемент больше чем arr,
копируем в него все элементы из arr, на последнюю позицию записываем новый элемент и заменяем arr на временный массив.

Добавить в IntList методы которые позволяют вставить в средину и удалить по индексу.*/


class Test {

    public static void main(String[] args) {

        basicArrangementsOfElements();

        bubbleSorting();
    }

    private static void basicArrangementsOfElements() {
        IntList listOfElements = new IntArrayList(0, 1, 2, 3, 4);
        System.out.println("Initial array: " + listOfElements);

        listOfElements.add(5);
        System.out.println("Array after adding an element on top: " + listOfElements);

        listOfElements.set(2, 100);
        System.out.println("Array after replacing 3rd element with 100: " + listOfElements);

        listOfElements.add(4, 88);
        listOfElements.remove(3);
        System.out.println("Array after replacing 4th element with 88: " + listOfElements);
    }

    private static void bubbleSorting() {
        IntList listForSorting = new IntArrayList(12, -2, 0, 25, 862, 15);
        System.out.println("Initial array: " + listForSorting);
        for (int i = 0; i < listForSorting.size() - 1; i++) {
            for (int j = 0; j < listForSorting.size() - i - 1; j++) {
                if (listForSorting.get(j) > listForSorting.get(j + 1)) {
                    int temp = listForSorting.get(j);
                    listForSorting.set(j, listForSorting.get(j + 1));
                    listForSorting.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted array: " + listForSorting);
    }
}
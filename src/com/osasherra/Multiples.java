package com.osasherra;

public class Multiples {

    /* Реализовать метод который вернет строку String, в которой через пробел все числа от 1 до 99 со след изменениями:
    (!!!Сам метод не должен ничего печатать в консоль, он просто должен вернуть строку!!!)
    - если число кратно 3 то вывести вместо него Hello
    - если число кратно 5 то вывести вместо него World
    - если число кратно и 3 и 5 то вывести вместо него HelloWorld
    - иначе вывести просто само число */

    public static void main(String[] args) {
        System.out.println(getMultiples());
    }

    public static String getMultiples() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                result.append("HelloWorld ");
            } else if (i % 5 == 0) {
                result.append("World ");
            } else if (i % 3 == 0) {
                result.append("Hello ");
            } else {
                result.append(i).append(" ");
            }
        }
        return result.toString().trim();
    }
}

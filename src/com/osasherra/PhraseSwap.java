package com.osasherra;

import java.util.Locale;
import java.util.Scanner;

public class PhraseSwap {

    /* Задана строка из английских слов через пробел. Написать метод который возвращает те же слова
   в обратном порядке. При этом слова изменены так что в каждом слове первая буква большая а остальные маленькие.*/

    public static void main(String[] args) {

        System.out.print("Enter an English phrase for some swapping magic: ");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        System.out.println("Result: " + swap(phrase));
    }

    private static String swap(String phrase) {
        String[] phraseSwap = phrase.toLowerCase(Locale.ROOT).split("\\s");
        StringBuilder builder = new StringBuilder();
        for (int i = phraseSwap.length - 1; i >= 0; i--) {
            builder.append(phraseSwap[i].substring(0, 1).toUpperCase()).append(phraseSwap[i].substring(1)).append(" ");
        }
        return builder.toString().trim();
    }
}

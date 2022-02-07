package com.osasherra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PeopleFactory {


    /*  Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
    Создать один или несколько конструкторов которые гарантирует что у каждого есть имя и фамилия.
    Создать список из 100 обьектов типа Person заполненных случайными данными
    (Например создать массив на несколько имен и выбирать из него случайным образом).
    Код который создает список Person и заполняет его данными разместить в другом классе, не в Person, например в Factory.
    Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно: не было человека весом 3 кг и ростом 180.
*/

    static Random RANDOM = new Random();
    static List<Person> generatePersonsList(int personsCount) {
        List<Person> personsList = new ArrayList<>();
        for (int i = 1; i <= personsCount; i++) {
            String firstName = String.valueOf(randomName());
            String familyName = String.valueOf(randomFamilyName());
            int age = RANDOM.nextInt(72) + 18;
            int height = RANDOM.nextInt(50) + 150;
            int weight = RANDOM.nextInt(30) + 60;
            personsList.add(new Person(firstName, familyName, age, height, weight));
        }
        return personsList;
    }

    public static firstNamesList randomName() {
        firstNamesList[] names = firstNamesList.values();
        return names[new Random().nextInt(names.length)];
    }

    public static familyNamesList randomFamilyName() {
        familyNamesList[] familyNames = familyNamesList.values();
        return familyNames[new Random().nextInt(familyNames.length)];
    }

    private enum firstNamesList {
        Alex, Vasyl, Mike, Markus, Lotta, Svetlana, Kir, Patrik, Susi, Inga, Vlad, Anton, Ella
    }

    public enum familyNamesList {
        Pirs, Fun, Green, Chuck, Kuka, Diaz, Ross, Google, Marvin, Cooper, Wolowitz, Knight, Wong, Woo
    }

}

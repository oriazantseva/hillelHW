package com.osasherra;

public class Person {

    private final String firstName;
    private final String familyName;
    private final int age;
    private final int height;
    private final int weight;

    public Person(String firstName, String familyName, int age, int height, int weight) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return "\nPerson " +
                firstName + " " +
                familyName + " " +
                age + "years" + " " +
                height + "cm" + " " +
                weight + "kg ";
    }

}
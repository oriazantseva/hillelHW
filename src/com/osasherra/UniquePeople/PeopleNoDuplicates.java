package com.osasherra.UniquePeople;

import java.util.Objects;

public class PeopleNoDuplicates {

    private final String firstName;
    private final String familyName;
    private final int age;
    private final int height;
    private final int weight;

    public PeopleNoDuplicates(String firstName, String familyName, int age, int height, int weight) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PeopleNoDuplicates)) return false;
        PeopleNoDuplicates that = (PeopleNoDuplicates) o;
        return firstName.equals(that.firstName) && familyName.equals(that.familyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, familyName);
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

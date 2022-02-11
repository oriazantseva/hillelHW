package com.osasherra.professions;

public class Driver extends Person {

    private int experience;

    public Driver(String dateOfBirth, String fullName, int experience) {
        super(dateOfBirth, fullName);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

}

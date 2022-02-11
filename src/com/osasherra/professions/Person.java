package com.osasherra.professions;

import java.time.LocalDate;
import java.time.Period;


public abstract class Person {

    protected String dateOfBirth;
    protected String fullName;

    public Person(String dateOfBirth, String fullName) {
        this.dateOfBirth = dateOfBirth;
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void getAge(String dateOfBirth) {
        String[] order = dateOfBirth.split("\\.");
        StringBuilder reverseDate = new StringBuilder();
        for (int i = order.length - 1; i >= 0; i--) {
            reverseDate.append(order[i]).append("-");
        }
        reverseDate.setLength(reverseDate.length() - 1);
        String changedDate = reverseDate.toString();
        LocalDate inputDate = LocalDate.parse(changedDate);
        LocalDate currentDate = LocalDate.now();
        System.out.println("Полный возраст водителя: " + Period.between(inputDate, currentDate).getYears());
    }

    @Override
    public String toString() {
        return "Person{" +
                "dateOfBirth='" + dateOfBirth + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

}

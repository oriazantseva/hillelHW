package com.osasherra.UniquePeople;

import static com.osasherra.UniquePeople.PeopleFactoryNoDuplicates.generatePersonsList;
import static com.osasherra.UniquePeople.PeopleFactoryNoDuplicates.removeDuplicates;

public class GeneralNoDuplicates {

    /* Написать метод который который удалит из этого списка добликаты по имени и фамилии.
    Т.е. останутся только люди с уникальной комбинайцией имя+фамилия. Остальные поля в расчет не берутся. */


    public static void main(String[] args) {
        System.out.println(PeopleFactoryNoDuplicates.generatePersonsList(100)); // with duplicates
        System.out.println(" "); // just a space to separate two lists
        System.out.println(removeDuplicates(generatePersonsList(100))); // <- calling method without duplicates
    }

}
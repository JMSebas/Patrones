package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("Josue","Moreira", LocalDate.of(2003, 12, 03));
        System.out.println(person.calculateAge());
    }
}
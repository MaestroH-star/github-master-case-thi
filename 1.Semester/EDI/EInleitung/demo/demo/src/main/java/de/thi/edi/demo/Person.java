package de.thi.edi.demo;

import jakarta.persistence.Entity;

public class Person {
    @Id
    @GeneralValue(strategy = )
    private Long id;
    private String name;


    public Person() {}
    public Person(String name) {}

    public String setName() {
        return name;
    }
}

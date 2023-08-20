package ru.gadjik.mylibrary.models;

public class Person {
    private int id;
    private String name;
    private int dateBirth;

    public Person(){}

    public Person(int id, String name, int dateBirth) {
        this.id=id;
        this.name = name;
        this.dateBirth = dateBirth;
    }
}

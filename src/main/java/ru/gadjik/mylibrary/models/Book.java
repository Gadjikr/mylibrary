package ru.gadjik.mylibrary.models;

public class Book {
    private int id;
    private String name;
    private String author;
    private int year;

    public Book(int id, String name, String author, int year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }
}

package ru.netology;

public class Book extends Product {
    protected String author;

    public Book(int id, String name, float cost, String author) {
        super(id, name, cost);
        this.author = author;
    }

}

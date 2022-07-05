package ru.netology;

public class Smartphone extends Product {
    protected String manufacturer;

    public Smartphone(int id, String name, float cost, String manufacturer) {
        super(id, name, cost);
        this.manufacturer = manufacturer;
    }


}

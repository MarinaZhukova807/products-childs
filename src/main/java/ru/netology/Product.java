package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public abstract class Product {
    private int id; //идентификатор
    protected String name; //название
    private float cost; //стоимость

}

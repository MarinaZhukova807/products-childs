package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductManagerTest {
    Product book3 = new Book(5, "Му-му", 250.20f, "И.А. Тургенев");
    Product smart3 = new Smartphone(6, "Galaxy s22 ultra", 100_000, "Samsung");
    Product book4 = new Book(7, "Анна Каренина", 600.20f, "Л.Н.Толстой");
    Product smart4 = new Smartphone(8, "Galaxy a72", 58_000, "Samsung");
    Product book5 = new Book(9, "The sun", 450.20f, "Author2");
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    @Test
    public void addElementsToManagerTest() {
        manager.add(book3);
        manager.add(smart3);
        manager.add(book4);
        manager.add(smart4);
        manager.add(book5);
        Product[] actual = repo.findAll();
        Product[] expected = {book3, smart3, book4, smart4, book5};
        assertArrayEquals(expected,actual);
    }
    @Test
    public void searchElementsByTextTest() {
        manager.add(book3);
        manager.add(smart3);
        manager.add(book4);
        manager.add(smart4);
        manager.add(book5);
        Product[] actual = manager.searchBy("axy");
        Product[] expected = {smart3, smart4};
        assertArrayEquals(expected,actual);
    }
    @Test
    public void removeElementsByIdTest() {
        manager.add(book3);
        manager.add(smart3);
        manager.add(book4);
        manager.add(smart4);
        manager.add(book5);
        manager.removeById(9);
        Product[] actual = repo.findAll();
        Product[] expected = {book3, smart3, book4, smart4};
        assertArrayEquals(expected,actual);
    }

}

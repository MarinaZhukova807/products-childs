package ru.netology;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductRepositoryTest {
    Product book1 = new Book(1, "The One", 150.20f, "Author1");
    Product smart1 = new Smartphone(2, "Galaxy a50", 50_000, "Samsung");
    Product book2 = new Book(3, "Война и мир", 1500.20f, "Л.Н.Толстой");
    Product smart2 = new Smartphone(4, "Galaxy s22", 80_000, "Samsung");
    Product book3 = new Book(5, "Му-му", 250.20f, "И.А. Тургенев");
    Product smart3 = new Smartphone(6, "Galaxy s22 ultra", 100_000, "Samsung");
    Product book4 = new Book(7, "Анна Каренина", 600.20f, "Л.Н.Толстой");
    Product smart4 = new Smartphone(8, "Galaxy a72", 58_000, "Samsung");
    Product book5 = new Book(9, "The sun", 450.20f, "Author2");

    ProductRepository repo = new ProductRepository();

    @Test
    public void saveElementsToRepository(){
        repo.save(book1);
        repo.save(smart1);
        repo.save(book2);
        repo.save(smart2);
        Product[] actual =repo.findAll();
        Product[] expected = {book1, smart1, book2, smart2};
        assertArrayEquals(expected,actual);
    }

}

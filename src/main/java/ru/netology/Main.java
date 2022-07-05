package ru.netology;

public class Main {
    public static void main(String[] args) {
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
        repo.save(book1);
        repo.save(smart1);
        repo.save(book2);
        repo.save(smart2);

        //repo.removeById(2);
        Product[] all = repo.findAll();

        ProductManager manager = new ProductManager(repo);
        manager.add(book3);
        manager.add(smart3);
        manager.add(book5);
        Product[] searchResult = manager.searchBy("axy");
    }
}

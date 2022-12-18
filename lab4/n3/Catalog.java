package ru.mirea.lab4.n3;
import java.util.ArrayList;

public enum Catalog {
    ManClothes(5, new Product[] {
            new Product("TShirt", "Red" ,1000, 1),
            new Product("Shirt", "White", 2000, 2),
            new Product("Trousers", "Black", 2500, 3),
            new Product("Shorts", "Blue", 2000, 4),
            new Product("Jacket", "Yellow", 5000, 5)
    }),
    WomanClothes(4, new Product[] {
            new Product("TShirt", "White" ,1000, 6),
            new Product("Skirt", "Rose", 2000, 7),
            new Product("Dress", "Red", 5000, 8),
            new Product("Top", "Black", 1500, 9)
    }),
    Shoes(7, new Product[] {
            new Product("Oxford", "Black", 5000, 10),
            new Product("Yeeze", "White", 10000, 11),
            new Product("Jordan", "Red", 15000, 12),
            new Product("Valenki", "Grey", 2000, 13),
            new Product("Sandals", "Brown", 5000, 14),
            new Product("Air Force 1", "White", 8000, 15),
            new Product("Catterpillar", "Orange", 10000, 16)
    }),
    Accessorises(5, new Product[] {
            new Product("Umbrella", "Blue Sky", 2500, 17),
            new Product("SunGlasses", "Black", 1000, 18),
            new Product("Little Bag", "Rose", 5000, 19),
            new Product("Big Bag", "Brown", 10000, 20),
            new Product("Scarf", "Green", 1500, 21)
    }),
    ForHome(3, new Product[] {
            new Product("Plate", "White", 500, 22),
            new Product("Glass", "NOCOLOR", 300, 23),
            new Product("Cup", "Black", 500, 24)
    });

    private int amount;
    public Product[] goods = new Product[amount];

    Catalog(int a,Product[] g) {
        this.amount = a;
        this.goods = g;
    }

    public void showCatalog() {
        for (Product pr : goods) {
            System.out.print("\n" + pr.toString());
        }
    }

}

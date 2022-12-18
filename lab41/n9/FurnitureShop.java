package ru.mirea.lab41.n9;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture t1 = new Table("wood", 1000, 5);
        Furniture t2 = new Table("metal", 500, 5);
        Furniture s1 = new Sofa("cotton", 2000, 3);
        Furniture s2 = new Sofa("wool", 3000, 5);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(s1);
        System.out.println(s2);
    }
}

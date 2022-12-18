package ru.mirea.lab4.n4;
import java.util.Scanner;

public class TestBrands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "1";
        while (name != "STOP") {
            System.out.println("Введите интересующую вас марку (ASUS, DELL, HP, MSI): ");
            name = sc.next();
            Brands br = Brands.valueOf(name);
            System.out.println("Компьютеры марки " + br);
            for (Computer cp : br.computers) {
                System.out.print(br + " " + cp.toString());
            }
        }
    }
}

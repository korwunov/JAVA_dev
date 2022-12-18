package ru.mirea.lab8.n10;
import java.util.Scanner;

public class main {

    static void reverseNum(long n) {
        if (n != 0) {
            System.out.print(n%10);
            reverseNum(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        long n = sc.nextLong();
        reverseNum(n);
    }
}

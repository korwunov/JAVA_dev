package ru.mirea.lab8.n2;
import java.util.Scanner;

public class main {

    static void showN(int i, int n) {
        if (i <= n) {
            System.out.println(i);
            i++;
            showN(i, n);
        }
        else return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        showN(1, n);
    }
}

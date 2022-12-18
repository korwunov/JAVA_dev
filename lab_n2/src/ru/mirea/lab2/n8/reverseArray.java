package ru.mirea.lab2.n8;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Введите количестов элементов массива\n");
        n = sc.nextInt();
        String[] data = new String[n];
        System.out.print("Введите элементы массива\n");
        for (int i = 0; i < n; i++) {
            data[i] = sc.next();
        }

        String tmp;
        for (int i = 0; i < (n / 2); i++) {
            tmp = data[i];
            data[i] = data[n - i - 1];
            data[n - i - 1] = tmp;
        }
        System.out.print("Перевёрнутый массив \n");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }

    }
}

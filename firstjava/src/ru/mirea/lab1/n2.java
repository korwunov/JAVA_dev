package ru.mirea.lab1;
import java.util.Scanner;

public class n2 {
    public static int findMax(int[] arr) {
        int max = arr[0], i = 1;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0], i = 1;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10, sum = 0;
        System.out.print("Введите количество элементов: ");
        n = sc.nextInt();
        int[] data = new int[n];
        int i = 0;
        while (i < n) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            data[i] = sc.nextInt();
            sum += data[i];
            i++;
        }
        System.out.print("Сумма: " + sum);
        System.out.println();
        System.out.print("Максимальный элемент: " + findMax(data));
        System.out.println();
        System.out.print("Минимальный элемент: " + findMin(data));

    }
}

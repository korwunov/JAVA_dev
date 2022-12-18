package ru.mirea.lab8.n6;
import java.util.Scanner;

public class main {

    static boolean isSimple(int n, int div) {
        if (n == 1 || n == 0) { return true; }
        if (div < n && n % div != 0) {
            div++;
            return isSimple(n, div);
        }
        if (div == n) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        System.out.print(isSimple(n, 2));
    }
}

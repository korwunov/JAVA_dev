package ru.mirea.lab8.n16;
import java.util.Scanner;

public class Max {

    static String reverseNum(long n, String s) {
        if (n != 0) {
            s += String.valueOf(n%10);
            n /= 10;
            return reverseNum(n, s);
        }
        return s;
    }

    static long findMax(long n, long maxNum) {
        if (n % 10 == 0) return maxNum;
        if (n % 10 > maxNum) {
            maxNum = n % 10;
        }
        return findMax((n / 10), maxNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность чисел в одну строку:");
        long num = sc.nextLong();
        String strNum = reverseNum(num, "");
        num = Integer.parseInt(strNum);
        System.out.println(findMax(num, 0));
    }
}

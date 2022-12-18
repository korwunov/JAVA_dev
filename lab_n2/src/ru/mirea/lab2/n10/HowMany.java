package ru.mirea.lab2.n10;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int count = 0;
        System.out.print("Введите строку \n");
        s = sc.nextLine();

        for(int i = 0; i < s.length() - 1; i++) {
            if (i != 0 && s.charAt(i) == ' '){
                count++;
            }
        }
        count++;
        System.out.print(count);
    }
}

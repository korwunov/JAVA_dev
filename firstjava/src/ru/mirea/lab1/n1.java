package ru.mirea.lab1;
import java.util.Scanner;

public class n1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 10;
        boolean flag = false;
        System.out.print("Введите размер массива: ");
        if(sc.hasNextInt()) {
            num = sc.nextInt();
            flag = true;
        }
        else {
            System.out.print("Требуется ввести целое число");
        }
        if (flag) {
            int [] data = new int[num];
            int sum = 0;
            System.out.print("Введите числа массива ");
            for (int i = 0; i < num; i++) {
                data[i] = sc.nextInt();
                sum += data[i];
            }
            System.out.print("Сумма элементов массива: " + sum);
            System.out.println();
            System.out.print("Среднее арифметическое: " + sum / num);
        }


    }
}

package ru.mirea.lab2.n3_n6;
import java.util.Scanner;
import java.util.ArrayList;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество кругов");
        System.out.println();
        int num = sc.nextInt();
        int _x;
        int _y;
        int _r;

        ArrayList<Circle> circles = new ArrayList<Circle>();
        for (int i = 0; i < num; i++) {
            System.out.print("Введите координаты центра и радиус");
            System.out.println();
            _x = sc.nextInt();
            _y = sc.nextInt();
            _r = sc.nextInt();

            Point p = new Point(_x, _y);
            Circle tmpC = new Circle(p, _r);
            circles.add(tmpC);
        }

        System.out.print("Площади кругов ");
        System.out.println();
        for (int i = 0; i < circles.size(); i++) {
            System.out.print((i + 1) + " ");
            System.out.print(circles.get(i).countSquare());
            System.out.println();
        }

        System.out.println();
        System.out.print("Длины кругов ");
        System.out.println();

        for (int i = 0; i < circles.size(); i++) {
            System.out.print((i + 1) + " ");
            System.out.print(circles.get(i).countLength());
            System.out.println();
        }

        System.out.print("Введите номера кругов для сравнения");
        System.out.println();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.print("Результат сравнения по длине ");
        System.out.println();
        Circle biggerL = circles.get(n1 - 1).compareCirclesLength(circles.get(n2 - 1));
        if (biggerL == circles.get(n1 - 1)) {
            System.out.print("=>" + n1 + " больше " + n2);
        }
        else if (biggerL == circles.get(n2 - 1)) {
            System.out.print("=>" + n2 + " больше " + n1);
        }
        else {
            System.out.print("=> Круги равны");
        }

        System.out.println();

        System.out.print("Результат сравнения по площади ");
        System.out.println();
        Circle biggerS = circles.get(n1 - 1).compareCirclesLength(circles.get(n2 - 1));
        if (biggerS == circles.get(n1 - 1)) {
            System.out.print("=>" + n1 + " больше " + n2);
        }
        else if (biggerS == circles.get(n2 - 1)) {
            System.out.print("=>" + n2 + " больше " + n1);
        }
        else {
            System.out.print("=> Круги равны");
        }

    }
}

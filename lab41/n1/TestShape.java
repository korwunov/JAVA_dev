package ru.mirea.lab41.n1;
import java.util.Objects;
import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название фигуры (Circle, Square, Rectangle)");
        String input = sc.next();
        while (!Objects.equals(input, "STOP")) {
            switch (input) {
                case ("Circle") -> {
                    System.out.println("Введите радиус: ");
                    int r = sc.nextInt();
                    Circle circ = new Circle(r);
                    System.out.println(circ.toString() + "\n");
                    System.out.println("Введите название фигуры (Circle, Square, Rectangle)");
                    input = sc.next();
                }
                case ("Square") -> {
                    System.out.println("Введите сторону: ");
                    int a = sc.nextInt();
                    Square sq = new Square(a);
                    System.out.println(sq.toString() + "\n");
                    System.out.println("Введите название фигуры (Circle, Square, Rectangle)");
                    input = sc.next();
                }
                case ("Rectangle") -> {
                    System.out.println("Введите две стороны: ");
                    int c = sc.nextInt();
                    int b = sc.nextInt();
                    Rectangle rect = new Rectangle(c, b);
                    System.out.println(rect.toString() + "\n");
                    System.out.println("Введите название фигуры (Circle, Square, Rectangle)");
                    input = sc.next();
                }
                default -> {
                    System.out.println("Фигура не найдена\n");
                    System.out.println("Введите название фигуры (Circle, Square, Rectangle)");
                    input = sc.next();
                }
            }
        }
    }
}

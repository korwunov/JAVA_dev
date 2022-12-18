package n3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Expression exp = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x: ");
        // Ввод элемента с клавиатуры
        int x = in.nextInt();
        System.out.println("x^2 - 2x + 1 = " + exp.evaluate(x));





















        System.out.println();
        System.out.println("Анекдот дня!");
        System.out.println("Программист Java выбросился из окна и упал через 7 дней🤪");
    }
}

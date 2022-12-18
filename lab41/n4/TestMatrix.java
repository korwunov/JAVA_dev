package ru.mirea.lab41.n4;
import java.util.Scanner;

public class TestMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количесвто столбцов и строк первой матрицы: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        Matrix m1 = new Matrix(col, row);
        System.out.println("Введите количесвто столбцов и строк первой матрицы: ");
        row = sc.nextInt();
        col = sc.nextInt();
        Matrix m2 = new Matrix(col, row);
        System.out.println("Сумма матриц");
        m1.matrixSum(m2);
        m1.outputMatrix();
        System.out.println("Умножение первой матрицы на 5");
        m1.matrixMultiplication(5);
        m1.outputMatrix();
    }
}

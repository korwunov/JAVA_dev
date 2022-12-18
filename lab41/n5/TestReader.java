package ru.mirea.lab41.n5;
import java.util.Scanner;

public class TestReader {
    public static void main(String[] args) {
        Reader rd = new Reader("Иванов А. В.", 124, "МГУ", "30.06.2000", 89754255445L);
        System.out.println(rd);
        rd.takeBook(2);
        rd.takeBook(new Book("Детство", "Толстой"),
                new Book("Капитанская дочка", "Пушкин"));
        rd.returnBook(5);
        rd.returnBook(new Book("Герой нашего времени", "Лермонтов"),
                new Book("Война и мир", "Толстой"),
                new Book("Преступление и наказание", "Достоевский "));
    }
}

package ru.mirea.lab2.n7;
import java.util.ArrayList;
import java.util.Scanner;

public class BookShelf {
    private int amount;
    ArrayList<Book> shelf = new ArrayList<Book>();
    Scanner sc = new Scanner(System.in);

    public BookShelf(int _amount) {
        this.amount = _amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void fillShelf() {
        for (int i = 0; i < amount; i++) {
            System.out.print("\nID Книги: " + (i + 1));
            System.out.print("\nВведите название: ");
            String _n = sc.next();
            System.out.print("Введите автора: ");
            String _a = sc.next();
            System.out.print("Введите год издания: ");
            int _y = sc.nextInt();
            Book bk = new Book(_n, _a, (i + 1), _y);
            shelf.add(bk);
        }
    }

    public void getOldestBooks() {

        int oldestYear = shelf.get(0).getYear();

        for (Book bk : shelf) {
            if (bk.getYear() < oldestYear) { oldestYear = bk.getYear(); }
        }

        System.out.print("\nКниги с самым ранним сроком издания\n");
        for (Book bk : shelf) {
            if (bk.getYear() == oldestYear) {
                System.out.print("Книга " + bk.getName() + "; Автор: " + bk.getAuthor() + "; Год: " + bk.getYear() + "; ID = " + bk.getId() + "\n");
            }
        }
    }

    public void getLatestBooks() {
        int latestYear = shelf.get(0).getYear();

        for (Book bk : shelf) {
            if (bk.getYear() > latestYear) { latestYear = bk.getYear(); }
        }

        System.out.print("\nКниги с самым поздним сроком издания\n");
        for (Book bk : shelf) {
            if (bk.getYear() == latestYear) {
                System.out.print("Книга " + bk.getName() + "; Автор: " + bk.getAuthor() + "; Год: " + bk.getYear() + "; ID = " + bk.getId() + "\n");
            }
        }
    }

    public void outputShelf() {
        System.out.print("\nВсе книги на полке\n");
        for(Book bk : shelf) {
            System.out.print("Книга " + bk.getName() + "; Автор: " + bk.getAuthor() + "; Год: " + bk.getYear() + "; ID = " + bk.getId() + "\n");
        }
    }

    /** Реализация на пузырьке, так как в 2 часа ночи мне было немного лень использовать
     *  алгоритмы быстрых сортировок, а через 8 часов нужно ехать на матан...
     */

    public void sortByDate() {
        Book tmpBook;
        for (int i = 0; i < shelf.size() - 1; i++) {
            for (int j = 0; j <= i; j++) {
                if (shelf.get(j).getYear() > shelf.get(j + 1).getYear()) {
                    tmpBook = shelf.get(j);
                    shelf.set(j, shelf.get(j + 1));
                    shelf.set(j + 1, tmpBook);
                }
            }

        }
    }

}

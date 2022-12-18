package ru.mirea.lab41.n5;
import java.util.ArrayList;

public class Reader {
    private String fio;
    private int id;
    private String faculty;
    private String birthDate;
    private long tel;

    public Reader(String fio, int id, String faculty, String birthDate, long tel) {
        this.fio = fio;
        this.id = id;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.tel = tel;
    }

    public void takeBook(int num) {
        System.out.println(this.fio + " взял " + num + " книги");
    }

    public void takeBook(Book ... books) {
        System.out.println(this.fio + " взял книги: ");
        for (Book bk : books) {
            System.out.print(bk + " \n");
        }
    }

    public void returnBook(int num) {
        System.out.println(this.fio + " вернул " + num + " книги");
    }

    public void returnBook(Book ... books) {
        System.out.print(this.fio + " вернул книги: \n");
        for (Book bk : books) {
            System.out.print(bk + " \n");
        }
    }

    @Override
    public String toString() {
        return this.fio + " " + this.id + " " + this.faculty + " "
                + this.birthDate + " " + this.tel;
    }
}

package ru.mirea.lab4.n1;
import java.util.Scanner;

public class timesOfYear {
    public enum Years {
        Summer(30, "Самое теплое время года"),
        Autumn(15, "Пора на учебу"),
        Winter(-10, "Новый год"),
        Spring(5, "Снег тает");

        private int averageTemp;
        private String description;

        Years(int temp, String desc) {
            this.averageTemp = temp;
            this.description = desc;
        }

        public int getAverageTemp() {
            return averageTemp;
        }

        public String getDescription() {
            return description;
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favYearTime;
        System.out.print("Введите любимое время года\n");
        favYearTime = sc.next();
        Years time = Years.valueOf(favYearTime);
        switch (time) {
            case Summer -> System.out.println("Я люблю Лето!");
            case Autumn -> System.out.println("Я люблю Осень!");
            case Winter -> System.out.println("Я люблю Зиму!");
            case Spring -> System.out.println("Я люблю Весну!");
        }

        System.out.println("Все времена года: \n");
        for (Years times : time.values()){
            System.out.println(times + "; Temperature = " + times.getAverageTemp() + "; " + times.getDescription());
        }

    }
}

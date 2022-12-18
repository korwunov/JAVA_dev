package ru.mirea.lab41.n2;
import java.util.Scanner;

public class TestPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 78945641;
        String mark;
        String mod;
        int weight;
        while (number != 0) {
            System.out.println("Введите номер, марку (IPhone, Samsung, Honor), модель (и вес) телефона");
            number = sc.nextInt();
            if (number != 0) {
                mark = sc.next();
                mod = sc.next();
                weight = sc.nextInt();
                switch(mark) {
                    case ("IPhone") -> {
                        IPhone iph = new IPhone(number, mod, weight);
                        System.out.println("Телефон " + mark + " " + iph.toString());
                        iph.receiveCall("Sanya");
                        iph.receiveCall("Vanya", 845131554);
                        iph.sendMessage(352534212, 423412543, 53453254, 324513124, 4365346, 7567568, 4315251, 413535);
                    }
                    case ("Samsung") -> {
                        Samsung sms = new Samsung(number, mod, weight);
                        System.out.println("Телефон " + mark + " " + sms.toString());
                        sms.receiveCall("Oleg");
                        sms.receiveCall("Zuev", 845131554);
                        sms.sendMessage(352534212, 423412543, 53453254, 324513124, 4365346, 7567568, 4315251, 413535);
                    }
                    case ("Honor") -> {
                        Honor hnr = new Honor(number, mod, weight);
                        System.out.println("Телефон " + mark + " " + hnr.toString());
                        hnr.receiveCall("Nick");
                        hnr.receiveCall("Kudz", 845131554);
                        hnr.sendMessage(352534212, 423412543, 53453254, 324513124, 4365346, 7567568, 4315251, 413535);
                    }
                }
            }
        }
    }
}

package ru.mirea.lab2.pockerStars_n9;
import java.util.Scanner;
import java.util.Random;

public class poker_stars_MIREA_EDITION {
    public static void main(String[] args) {
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♠", "♥", "♣", "♦"};
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество игроков\n");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Player №" + (i + 1) + " cards: ");
            for(int j = 0; j < 5; j++) {
                String rndmCard = suits[rand.nextInt(4)] + nums[rand.nextInt(13)];
                System.out.print(rndmCard + " ");
            }
            System.out.println();
        }

    }
}

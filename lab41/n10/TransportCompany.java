package ru.mirea.lab41.n10;
import java.util.Scanner;

public class TransportCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vehicle auto = new Auto(500, 700, 100);
        Vehicle plain = new Plain(5000, 2500, 926);
        Vehicle train = new Train(2500, 1000, 200);
        Vehicle ship = new Ship(1000, 300, 60);

        System.out.println("Введите количество пассажиров");
        int personsAmount = sc.nextInt();
        System.out.println("Введите вес груза в килограммах");
        int cargoWeight = sc.nextInt();
        System.out.println("Введите километраж пути");
        int kilometers = sc.nextInt();

        System.out.println("Автомобиль: Цена за пассажиров: " + auto.countPricePerPerson(personsAmount) +
                "; Цена за груз: " + auto.countPricePerKG(cargoWeight) +
                "; Время в пути: " + auto.countTime(kilometers));

        System.out.println("Самолет: Цена за пассажиров: " + plain.countPricePerPerson(personsAmount) +
                "; Цена за груз: " + plain.countPricePerKG(cargoWeight) +
                "; Время в пути: " + plain.countTime(kilometers));

        System.out.println("Поезд: Цена за пассажиров: " + train.countPricePerPerson(personsAmount) +
                "; Цена за груз: " + train.countPricePerKG(cargoWeight) +
                "; Время в пути: " + train.countTime(kilometers));

        System.out.println("Корабль: Цена за пассажиров: " + ship.countPricePerPerson(personsAmount) +
                "; Цена за груз: " + ship.countPricePerKG(cargoWeight) +
                "; Время в пути: " + ship.countTime(kilometers));
    }
}

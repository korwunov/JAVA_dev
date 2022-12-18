package ru.mirea.lab41.n2;

public class Phone {
    private long number;
    private String model;
    private int weight = 0;

    public Phone() {};

    public Phone(int num, String mod) {
        this.number = num;
        this.model = mod;
    }
    public Phone(int num, String mod, int weight) {
        this(num, mod);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, long num) {
        System.out.println("Звонит " + name + " с номера " + num);
    }

    public long getNumber() {
        return number;
    }

    public void sendMessage(int ... numbers) {
        for (int num : numbers) {
            System.out.println("Сообщение отпралвено на номер " + num);
        }
    }

    @Override
    public String toString() {
        return this.model + " " + this.number + " " + this.weight;
    }
}

package ru.mirea.lab2.n4;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<String> computers = new ArrayList<String>();

    public void addComputer(String name){
        this.computers.add(name);
    }
    public void deleteComputer(String name){
        int i = findComputer(name);
        if (i != -1){
            this.computers.remove(i);
        }
    }
    public int findComputer(String name){
        for (int i = 0; i < computers.size(); i++){
            if (computers.get(i) == name){
                System.out.println("Компьютер найден.");
                return i;
            }
        }
        System.out.println("Компьютер не найден.");
        return -1;
    }
    public void addComputers() {
        String computer;
        int n;
        Scanner source = new Scanner(System.in);
        System.out.println("Введите количество добавляемых компьюетров");
        n = source.nextInt();
        for (int i = 0; i < n + 1; i++) {
            computer = source.nextLine();
            System.out.println("Введите название компьютера.");
            this.computers.add(computer);
        }
    }
    public void outputComputer(){
           computers.forEach(System.out::println);
    }


}

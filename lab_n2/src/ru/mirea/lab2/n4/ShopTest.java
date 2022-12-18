package ru.mirea.lab2.n4;
import java.util.Scanner;
public class ShopTest {
    static Scanner  source = new Scanner(System.in);

    public static String read_name(){
        System.out.println("Введите название компьютера");
        String name;
        name = source.next();
        return name;
    }

    public static void main(String[] args){
        int n= 1;
        Shop shp = new Shop();
        String name;
        while(n != 0){
            System.out.println("Функционал класса \n0. Выход \n1. Добавить несколько компьютеров \n" +
                    "2. Найти компьютер по имени\n" +
                    "3. Удалить компьютер\n"+
                    "4. Добавить компьютер\n"+
                    "5. Полный список пк");
            n = source.nextInt();
            switch (n){
                case 1:
                    shp.addComputers();
                    break;
                case 2:
                    shp.findComputer(read_name());
                    break;
                case 3:
                    shp.deleteComputer(read_name());
                    break;
                case 4:
                    shp.addComputer(read_name());
                    break;
                case 5:
                    shp.outputComputer();
                    break;
                default:
                    System.out.print("Введено некорректное значение\n");

            }
        }

    }
}

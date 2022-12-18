package ru.mirea.lab4.n3;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class E_shop {

    public boolean Authorization() {
        System.out.println("Авторизация интернет-магазина");
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(!flag) {
            System.out.println("Введите имя пользователя: ");
            String log = sc.next();
            AuthData user = AuthData.valueOf(log);
            System.out.println("Введите пароль: ");
            String pass = sc.next();
            if (Objects.equals(user.getPassword(), pass)) {
                flag = true;
                System.out.println("Добро пожаловать, " + user + "!");
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();
        E_shop shp = new E_shop();

        boolean authFlag = shp.Authorization();
        if (authFlag) {
            int inputProductID = 0;
            while (inputProductID == 0) {
                System.out.println("Доступные категории товаров\n");
                for (Catalog cat : Catalog.values()) {
                    System.out.println(cat);
                }
                System.out.println("Введите имя нужной категории (Для перехода в корзину введите CART): ");
                String catName = sc.next();
                if (!Objects.equals(catName, "CART")) {
                    Catalog targetCatalog = Catalog.valueOf(catName);
                    System.out.println("Товары категории " + targetCatalog);
                    targetCatalog.showCatalog();
                    System.out.print("\n\nВведите ID товара, чтобы добавить его в корзину или введите 0, чтобы вернуться к каталогам ");
                    inputProductID = sc.nextInt();
                    if (inputProductID > 0) {
                        for (Product pr : targetCatalog.goods) {
                            if (pr.getID() == inputProductID) {
                                cart.add(pr);
                                System.out.println("Товар добавлен в корзину!");
                                inputProductID = 0;
                            }
                        }
                    }
                }
                else {
                    if (cart.size() == 0) {
                        System.out.println("Пустая корзина!");
                        inputProductID = 0;
                    }
                    else {
                        for (Product pr : cart) {
                            System.out.println(pr.toString());
                        }
                        System.out.println("Введите BUY для оплаты товаров");
                        String word = sc.next();
                        if (Objects.equals(word, "BUY")) {
                            System.out.println("Введите номер карты: ");
                            int cardNumber = sc.nextInt();
                            System.out.println("Введите срок действия карты: ");
                            String expiredDate = sc.next();
                            System.out.println("Введите CVC/CVV код: ");
                            int CVC = sc.nextInt();
                            System.out.println("\nСпасибо за выбор нашего интернет магазина! Оцените нашу работу по шкале от 1 до 5");
                            int rate = sc.nextInt();
                        }
                        else {
                            inputProductID = 0;
                        }
                    }
                }
            }
        }
    }
}

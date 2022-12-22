package lab29_30.Tests;

import lab29_30.extensions.OrderAlreadyAddedException;
import lab29_30.items.Dish;
import lab29_30.items.Drink;
import lab29_30.items.DrinkTypeEnum;
import lab29_30.items.MenuItem;
import lab29_30.managers.InternetOrdersManager;
import lab29_30.orders.InternetOrder;
import lab29_30.orders.Order;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Test {
    private static List<MenuItem> items;
    private static Order order;
    private static InternetOrdersManager ordersManager;
    private static final String filename = "Java\\Serializable\\lab32";

    public static void main(String[] args) throws OrderAlreadyAddedException {
        //readFromFile();
        if (!readFromFile()) {
            System.out.println("Items inside");
            items = List.of(
                    new Drink(200, "Cola", "CocaCola", 13, DrinkTypeEnum.WINE),
                    new Dish(400, "Sandwhich", "Cheese&Ham"),
                    new Drink(300, "Whiskey", "Jack Daniels", 20, DrinkTypeEnum.WHISKEY),
                    new Dish(1000, "Meat", "Steak Rybay")
            );
            order = new InternetOrder();
            ordersManager = new InternetOrdersManager();
        }

        for (var i : items) {
            order.add(i);
            System.out.println(i);
        }

        ordersManager.add(order);

        writeToFile();
    }

    public static boolean readFromFile() {
        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename))
        ) {
            items = (List<MenuItem>) input.readObject();
            order = (Order) input.readObject();
            ordersManager = (InternetOrdersManager) input.readObject();
        } catch (Exception e) {
            return false;
        }

        for (var i : items) {
            order.add(i);
            System.out.println(i);
        }

        return items != null;
    }

    public static boolean writeToFile() {
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename))
        ) {
            output.writeObject(items);
            output.writeObject(order);
            output.writeObject(ordersManager);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}

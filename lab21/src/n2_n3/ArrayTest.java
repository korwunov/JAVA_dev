package n2_n3;

public class ArrayTest {
    public static void main(String[] args) throws Exception {
        UniversalArray<Integer> arr1 = new UniversalArray<>(10);
        arr1.showArray();
        System.out.println();
        System.out.println(arr1.getElement(2));

        UniversalArray<String> arr2 = new UniversalArray<>(3);
        arr2.showArray();
        System.out.println();
        System.out.println(arr2.getElement(2));

        UniversalArray<Long> arr3 = new UniversalArray<>(2);
        arr3.showArray();
        System.out.println();
        System.out.println(arr3.getElement(1));








        System.out.println("Анекдот дня!");
        System.out.println("Офис: новенький системный администратор пришел к своим коллегам");
        System.out.println("-- Ребят, у вас ножа не найдётся? А то я исходникни для салата взял.");
        System.out.println("-- Андрей, это называется овощи");

        for (int i = 0; i < 100; i++) {
            System.out.print("😂");
        }
    }
}

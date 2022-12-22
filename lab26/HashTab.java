package lab26;

import java.util.HashMap;
import java.util.Map;

public class HashTab<T, V> {

    public static void main(String[] args) {

        HashMap<Integer, String> passportsAndNames = new HashMap<>();

        passportsAndNames.put("Abdulov Nikita Alexandrovich".hashCode(), "Abdulov Nikita Alexandrovich");
        passportsAndNames.put("Epifanof Anoton Valerievich".hashCode(), "Epifanof Anoton Valerievich");
        passportsAndNames.put("Korshunov Petr Andreevich".hashCode(), "Korshunov Petr Andreevich");

        String nameToFind = passportsAndNames.get("Abdulov Nikita Alexandrovich".hashCode());
        System.out.println();
        System.out.println("Search by key: ");
        System.out.println(nameToFind);

        passportsAndNames.remove("Korshunov Petr Andreevich".hashCode());
        System.out.println();
        System.out.println("Remove Korshunov Petr from Hashmap: ");
        System.out.println(passportsAndNames);

    }
}

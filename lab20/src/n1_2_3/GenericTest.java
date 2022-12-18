package n1_2_3;
import java.io.Serializable;

public class GenericTest {
    public static void main(String[] args) {
        Animal testAnimalObj = new Animal();
        Generic<Comparable<String>, Serializable, Integer> generic = new Generic<>("abc", testAnimalObj, 1);
        generic.showT();
        generic.showV();
        generic.showK();

















        System.out.println();
        System.out.println("Анекдот дня!");
        System.out.println("В каком-то фэнтези читал про Страшные Тёмные Письмена, которые невозможно прочесть");
        System.out.println("так как само их начертание противно человеческому глазу и вызывает желание отвести взгляд.");
        System.out.println("В целом очень напоминает то, как я читаю учебные материалы по джаве.");
    }
}

package n1;

public class Main {
    public static void main(String[] args) {

        ChairFactory chairFactory = new ChairFactory();
        VictorianChair victorianChair = chairFactory.createVictorianChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();
        MagicChair magicChair = chairFactory.createMagicChair();
        magicChair.doMagic();
        System.out.println( functionalChair.sum(1,2));
        System.out.println(victorianChair.getAge());
        Client client = new Client();
        client.sit();
        client.setChair(magicChair);






















        System.out.println();
        System.out.println("Анекдот дня?");
        System.out.println("Решил Иван Царевич стать программистом.");
        System.out.println("И погиб - java задушила🐸");
    }

}

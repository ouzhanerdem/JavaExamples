package Lesson5;

public class Main {
    public static void isGonder(Calisan calisan, Task task) {
        if (calisan.taskIsValid(task)) {
            System.out.println(calisan.isYap(task));
        } else {
            System.out.println(calisan.getTakim().getIsim() + " takımı bu module sahip değil...");
        }


    }

    public static void main(String[] args) {
        Modul modul1 = new Modul("Basket");
        Modul modul2 = new Modul("Search");
        Modul modul3 = new Modul("Chechout");


        Takim takim = new Takim("CF1");

        takim.addModul(modul1.getAd());

        Tester tester = new Tester("Efecan", "Köksal", "30", takim);
        Task task = new Task("Basket refactor", 33, "Android", modul3);
        System.out.println(tester.isYap(task));

        Analist analist = new Analist("Halil", "Şahin", "29", takim);
        Developer developer = new Developer("Mehmet", "Tunç", "29", takim);


        isGonder(analist, task);
        isGonder(developer, task);
        isGonder(tester, task);


    }
}

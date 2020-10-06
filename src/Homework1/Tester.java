package Homework1;


public class Tester extends Calisan {
    public Tester(String isim, String yas, String takim) {
        super(isim, yas, takim);
    }

    @Override
    public String isYap(Task task) {
        return this.getIsim() + "  " + task.getAd() + " adlı işi test ediyor.";
    }
}

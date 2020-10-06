package Lesson5;

public class Tester extends  Calisan{
    public Tester(String isim, String soyad, String yas, Takim takim) {
        super(isim, soyad, yas, takim);
    }

    @Override
    public String isYap(Task task) {
        return this.getIsim() + "  " + task.getAd() + " adlı işi test ediyor.";
    }

}

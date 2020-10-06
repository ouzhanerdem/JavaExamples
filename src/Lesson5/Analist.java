package Lesson5;

public class Analist extends Calisan {
    public Analist(String isim, String soyad, String yas, Takim takim) {
        super(isim, soyad, yas, takim);
    }

    @Override
    public String isYap(Task task) {
        return this.getIsim() + " " + task.getAd() + " işin analizini yazıyor...";
    }
}

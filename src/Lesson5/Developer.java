package Lesson5;

public class Developer extends Calisan {

    public Developer(String isim, String soyad, String yas, Takim takim) {
        super(isim, soyad, yas, takim);
    }

    @Override
    public String isYap(Task task) {
        return this.getIsim() + " " + task.getAd() + " işin development yapıyor...";
    }
}

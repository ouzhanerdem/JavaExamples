package Homework1;


public class Analist extends Calisan {
    public Analist(String isim, String yas, String takim) {

        super(isim, yas, takim);
    }

    @Override
    public String isYap(Task task) {
        return this.getIsim() + " " + task.getAd() + " işin analizini yazıyor...";
    }
}

package Homework1;


public class Developer extends Calisan {
    public Developer(String isim, String yas, String takim) {
        super(isim, yas, takim);
    }


    @Override
    public String isYap(Task task) {
        return this.getIsim() + " " + task.getAd() + " işin development yapıyor...";
    }


}

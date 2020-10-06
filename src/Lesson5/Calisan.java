package Lesson5;

public class Calisan {
    //Super
    private String isim;
    private String soyad;
    private String yas;
    private Takim takim;

    public Calisan(String isim, String soyad, String yas, Takim takim) {
        this.isim = isim;
        this.soyad = soyad;
        this.yas = yas;
        this.takim = takim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public Takim getTakim() {
        return takim;
    }

    public void setTakim(Takim takim) {
        this.takim = takim;
    }

    public String isYap(Task task) {
        return this.isim + "  " + task.getAd() + " işini yapıyor.";
    }

    public boolean taskIsValid(Task task) {
        for (Modul teamModul : this.takim.getModul()) {
            if (teamModul.getAd().equals(task.getModul().getAd())) {
                return true;
            }

        }
        return false;
    }

}

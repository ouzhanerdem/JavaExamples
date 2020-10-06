package Homework1;




public class Calisan {
    //Superclass
    private String isim;

    private String yas;
    private String takim;

    public Calisan(String isim, String yas, String takim) {
        this.isim = isim;

        this.yas = yas;
        this.takim=takim;
    }

    public Calisan() {
        //Super
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }



    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getTakim() {
        return takim;
    }

    public void setTakim(String takim) {
        this.takim = takim;
    }
    public String isYap(Task task){
        return this.isim + "  " + task.getAd() + " işini yapıyor.";
    }

}

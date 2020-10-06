package Homework1;


import java.util.ArrayList;
import java.util.List;

public class Takim {
    private String isim;
    private List<Modul> modul;

    public Takim(String isim) {
        this.isim = isim;
        this.modul = new ArrayList<Modul>();
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public List<Modul> getModul() {
        return modul;
    }

    public void setModul(List<Modul> modul) {
        this.modul = modul;
    }

    public void addModul(String name) {
        this.modul.add(new Modul(name));
    }

}

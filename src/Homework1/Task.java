package Homework1;

import Lesson5.Modul;

public class Task {
    private String ad;
    private int taskNO;
    private String proje;
    private Modul modul;

    public Task(String ad, int taskNO, String proje, Modul modul) {
        this.ad = ad;
        this.taskNO = taskNO;
        this.proje = proje;
        this.modul = modul;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getTaskNO() {
        return taskNO;
    }

    public void setTaskNO(int taskNO) {
        this.taskNO = taskNO;
    }

    public String getProje() {
        return proje;
    }

    public void setProje(String proje) {
        this.proje = proje;
    }

    public Modul getModul() {
        return modul;
    }

    public void setModul(Modul modul) {
        this.modul = modul;
    }
}

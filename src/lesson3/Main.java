package lesson3;

public class Main {

    public static void main(String[] args){
       /* Abone abone = new Abone();
        abone.isim = "Oğuzhan Erdem";
        abone.bakiye = 1000;
        abone.sehir = "Ankara";
        abone.dogalgaz_kullan(1000); */

        GelismisAbone gelismisAbone = new GelismisAbone("Oğuzhan Erdem",200,"İstanbul");
        gelismisAbone.bakiye_ogren();

    }
}

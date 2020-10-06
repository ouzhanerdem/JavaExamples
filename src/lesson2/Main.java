package lesson2;


public class Main {

    public static void main(String[] args) {

        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("MODELMONİTOR", "MSI", "24.5", resolution);
        Kasa kasa = new Kasa("mODELKASA", "MSIKASA", "CELİK");
        Anakart anakart = new Anakart("B450 PRO", "ASUS", 40, "YOK");
        Bilgisayar bilgisayar = new Bilgisayar(monitor, kasa, anakart);

        bilgisayar.getKasa().bilgisayari_ac();
        bilgisayar.getMonitor().monitoru_kapat();
        bilgisayar.getAnakart().istelim_sistemi_yukle("Naber OS BRO BRAA!!");


    }
}

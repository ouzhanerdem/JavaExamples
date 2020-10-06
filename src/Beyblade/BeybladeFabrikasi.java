package Beyblade;

public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beyblade_turu) {
        if (beyblade_turu.equals("Dragon")) {
            return new Dragon("Tako", 20, 10, "Mavi Ejder", "Konuşma");

        } else if (beyblade_turu.equals("Dranza")) {
            return new Dranza("Kai", 202, 103, "Kırmızı Anka");

        } else if (beyblade_turu.equals("Drayga")) {
            return new Drayga("Rei", 120, 130, "Beyaz Kaplan");

        } else if (beyblade_turu.equals("Draciel")) {
            return new Draciel("Max", 230, 150, "Kara Kaplumbağa");

        } else {
            return null;
        }

    }
}

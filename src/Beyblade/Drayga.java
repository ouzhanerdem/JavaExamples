package Beyblade;

public class Drayga extends Beyblade {
    private String kutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkıyor");
        System.out.println(getBeybladeci() + " ın  Saldırısı Kaplan pençesi!");
    }

    @Override
    public void bilgilerimiGoster() {
        super.bilgilerimiGoster();
        System.out.println(kutsalCanavar);
    }
}

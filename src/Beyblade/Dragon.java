package Beyblade;

public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }

    public String getGizliYetenek() {
        return gizliYetenek;
    }

    public void setGizliYetenek(String gizliYetenek) {
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkıyor");
        System.out.println(getBeybladeci() + " ın  Saldırısı Hayalet kasırga!");
    }

    @Override
    public void bilgilerimiGoster() {
        super.bilgilerimiGoster();
        System.out.println(kutsalCanavar + " ," + gizliYetenek);
    }
}

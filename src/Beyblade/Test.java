package Beyblade;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        System.out.println("Beyblade programına hoşgeldiniz...");
        System.out.println("Çıkış için q ya basın");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hangi Beyblade...");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else{
                BeybladeFabrikasi fabrikasi = new BeybladeFabrikasi();
                Beyblade beyblade = fabrikasi.beybladeUret(islem);
                if (beyblade == null) {
                    System.out.println("Lütfen geçerli bir beyblade ismi girin...");
                }
                else{
                    beyblade.bilgilerimiGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }


    }
}

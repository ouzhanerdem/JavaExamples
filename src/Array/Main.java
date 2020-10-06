package Array;

public class Main {

    public static void array_print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " değeri, " + array[i]);
        }


    }

    public static double average(int[] array) {

        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];


        }
        double ortalama = (double) toplam / array.length;

        return ortalama;
    }

    public static void main(String[] args) {
        //int[] a= new int[10];

        //int[] z={10,20,30,40,50};
        //System.out.println(z.length);
        //Scanner scanner = new Scanner(System.in);

        // a[5] = 505050500;
        // System.out.println(a[5]);
        int[] o = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        array_print(o);
        double ortalama = average(o);
        System.out.println(ortalama);
        //System.out.println(o[0]);
       /* for (int i = 0; i < 10; i++) {
            a[i] = i*4 + 2;
        }*/

       /* for (int i = 0; i <10 ; i++) {
            a[i] = scanner.nextInt();

        }
        for (int b = 0; b < 10; b++) {
            System.out.println(a[b]);

        }*/


    }
}

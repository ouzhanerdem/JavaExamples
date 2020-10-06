package Array2;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] array_doldur(int sayi) {
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }

    public static void array_print(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element: " + array[i]);
        }
    }

    public static void array_sort(int[] array) {
        Arrays.sort(array);
        array_print(array);

    }

    public static void main(String[] args) {
        //int [] array = array_doldur(3);
        // array_print(array);
        //array_sort(array);
        int[] a1 = {1, 2, 4, 5, 6, 7};
        int[] a2 = {1, 2, 4, 5, 6, 7};

        if (Arrays.equals(a1, a2)) {
            System.out.println("Eşitler");

        } else {
            System.out.println("Eşit değiller");
        }


    }
}

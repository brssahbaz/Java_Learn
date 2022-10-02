package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu cm olarak giriniz: ");
        int boy= sc.nextInt();
        System.out.print("Lütfen kilonuzu kg olarak giriniz: ");
        int kilo=sc.nextInt();
        int vkt_int=10000*kilo/(boy*boy);
        float  vkt_fl=(float) 10000*kilo/(boy*boy);
        System.out.println("Vucut Kitle Endeksiniz: "+vkt_int);
        System.out.print("Vucut Kitle Endeksiniz: ");
        System.out.format("%.2f", vkt_fl);

      //OUTPUT: Lütfen boyunuzu cm olarak giriniz: 180
      //Lütfen kilonuzu kg olarak giriniz: 90
      //Vucut Kitle Endeksiniz: 27
      //Vucut Kitle Endeksiniz: 27,78
      //Process finished with exit code 0







    }
}

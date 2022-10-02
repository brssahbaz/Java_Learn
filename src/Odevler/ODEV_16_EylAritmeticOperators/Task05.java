package Odevler.ODEV_16_EylAritmeticOperators;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen Saat Giriniz: ");
        int saat=sc.nextInt();
        System.out.println("Lütfen Dakika Giriniz: ");
        int dakika=sc.nextInt();
        System.out.println("Lütfen Saniye Giriniz: ");
        int saniye=sc.nextInt();
        System.out.println(saat+" Saat "+dakika+" dakika "+saniye+" saniye toplam "+(3600*saat+60*dakika+saniye)+" saniyedir.");
        // OUTPUT: Lütfen Saat Giriniz:
        //1
        //Lütfen Dakika Giriniz:
        //10
        //Lütfen Saniye Giriniz:
        //50
        //1 Saat 10 dakika 50 saniye toplam 4250 saniyedir.


    }

}

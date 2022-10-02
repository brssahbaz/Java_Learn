package Odevler.ODEV_16_EylAritmeticOperators;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen Saniye Giriniz: ");
        int saniye=sc.nextInt();
        int saat=saniye/3600;
        int dakika=(saniye %3600)/60;
        int kalan=saniye-(saat*3600+dakika*60);
        System.out.println(saniye+" Saniye "+saat+" saat "+dakika+" dakika "+kalan+" saniyedir.");
        // OUTPUT: Lütfen Saniye Giriniz:
        //4250
        //4250 Saniye 1 saat 10 dakika 50 saniyedir.



    }
}

package Odevler.ODEV_24_EYL_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // TASK :  // TASK GİRİLEN BİR CÜMLEDE ARANAN KELİMEYİ AARAYAB CODE --> ternary kullanınız

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Cümle Giriniz.");
        String cumle = sc.nextLine().toLowerCase();
        System.out.println("Hangi Kelimeyi Aramak İstiyorsunuz?");
        String kelime = sc.nextLine().toLowerCase();
        System.out.println((cumle.contains(kelime)?"Aradığın kelime cümlede vardır.":"Aradığın kelime cümlede yoktur."));


        // OUTPUT: Bir Cümle Giriniz.
        //Bugün hava ÇOK güzel
        //Hangi Kelimeyi Aramak İstiyorsunuz?
        //HAVA
        //Aradığın kelime cümlede vardır.


















    }
}


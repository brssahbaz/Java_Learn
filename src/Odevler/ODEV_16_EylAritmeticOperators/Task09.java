package Odevler.ODEV_16_EylAritmeticOperators;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen Çiftlikte Bulunan İnek Sayısını giriniz: ");
        int inek=sc.nextInt();
        System.out.println("Lütfen Çiftlikte Bulunan Koyun Sayısını giriniz: ");
        int koyun=sc.nextInt();
        System.out.println("Lütfen Çiftlikte Bulunan Tavuk Sayısını giriniz: ");
        int tavuk=sc.nextInt();
        System.out.println(" Çiftlikte Bulunan Hayvanların Ayak Sayılarının Toplamı= "+(4*(inek+koyun)+2*tavuk)+" dir.");

        // OUTPUT: Lütfen Çiftlikte Bulunan İnek Sayısını giriniz:
        //20
        //Lütfen Çiftlikte Bulunan Koyun Sayısını giriniz:
        //10
        //Lütfen Çiftlikte Bulunan Tavuk Sayısını giriniz:
        //5
        // Çiftlikte Bulunan Hayvanların Ayak Sayılarının Toplamı= 130 dir.



    }

}

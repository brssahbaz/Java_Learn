package HalukJava.J11_MethodCreation;

import java.util.Scanner;

public class C04_MethodCreation {
    public static void main(String[] args) {
        // Task:   Girilen ad ve soyadın ilk harfleri büyük düğerlerini küçük yapan method create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Adınızı giriniz:");
        String ad = sc.nextLine().toLowerCase();
        System.out.println("Adınızı giriniz:");
        String soyAd = sc.nextLine().toLowerCase();


        isimSoyisimHarfKontrol(ad, soyAd);
        System.out.println(isimSoyisimHarfKontrol2(ad, soyAd));


    } // main sonu

    public static void isimSoyisimHarfKontrol(String ad, String soyad) { // return typsız

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1);
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1);
        System.out.println("ad soyad: "+ad+" "+soyad);

    }
    public static String isimSoyisimHarfKontrol2(String ad, String soyad) { // RETURN typlı

        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1);
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1);

        return ad + " " + soyad;


    }
}

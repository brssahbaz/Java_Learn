
package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class C09_Replaceall_2 {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */

     /*   String str = "javaCAN'lara selam olsun java ile bolcana offer";
        java.lang.System.out.println(str.replace('a', '@'));//j@v@CAN'l@r@ sel@m olsun j@v@ ile bolc@n@ offer
        java.lang.System.out.println(str.replace("can", "kan"));//javaCAN'lara selam olsun java ile bolkana offer
        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */

       // java.lang.System.out.println(str.replaceFirst("a", "@"));//j@vaCAN'lara selam olsun java ile bolcana offer



// replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adınızı giriniz : ");
        String name = scan.nextLine();
        System.out.println("Lütfen soyadınızı giriniz : ");
        String surName = scan.nextLine();
        System.out.println("Lütfen 16 Haneli Kredi Kart numarınızı giriniz : ");
        String kart = scan.nextLine();
        String yeniName=name.toUpperCase().charAt(0)+name.substring(1).replaceAll("\\w","*");
        String yeniSurName=surName.toUpperCase().charAt(0)+surName.substring(1).replaceAll("\\w","*");

        if (kart.length()==16) {
            String yeniKart="**** **** **** "+kart.substring(12);
            System.out.println("Ad soyad: "+yeniName+" "+yeniSurName+"\n"+"Kart No: "+yeniKart);
        } else System.out.println("Hatalı Giriş Yaptınız.Kart Numaranız 16 haneli olmalı.");



    }


}


package Odevler.ODEV_24_EYL_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ifade Giriniz.");
        String cumle = sc.nextLine().toLowerCase();
        String space = " ";
        System.out.println((cumle.contains(space)?"Girdiğiniz ifadede boşluk vardır.":"Girdiğiniz ifadede boşluk yoktur."));

        // OUTPUT: Bir ifade Giriniz.
        //asder der d e
        //Girdiğiniz ifadede boşluk vardır.







    }
}


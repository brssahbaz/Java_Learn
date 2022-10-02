package Odevler.ODEV_24_EYL_StringManipulation;

import java.util.Scanner;

public class stringManuplation {
    public static void main(String[] args) {

        int sonuc1 = toplam(70, 80);
        System.out.println(sonuc1);
        int sonuc2 = toplam(10, 20, 30);
        System.out.println(sonuc2);


    }


    public static int toplam(int say1, int say2) {
        int toplama = say1 + say2;
        return toplama;


    }

    public static int toplam(int say1, int say2, int say3) {
        int toplama = say1 + say2 + say3;
        return toplama;

    }
}
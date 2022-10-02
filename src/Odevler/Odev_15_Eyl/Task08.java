package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


        Scanner not=new Scanner(System.in);
        System.out.println("1. Vize Notunuzu Giriniz: ");
        short vize1=not.nextShort();
        System.out.println("2. Vize Notunuzu Giriniz: ");
        short vize2=not.nextShort();
        System.out.println("Final Notunuzu Giriniz: ");
        short fin=not.nextShort();
        System.out.println("Not Ortalamanız: "+((0.3*(vize1+vize2)/2)+(0.7*fin)));

        // OUTPUT:1. Vize Notunuzu Giriniz:
        //40
        //2. Vize Notunuzu Giriniz:
        //60
        //Final Notunuzu Giriniz:
        //80
        //Not Ortalamanız: 71.0
    }
}

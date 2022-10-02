package Odevler.ODEV_16_EylAritmeticOperators;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner sc= new Scanner(System.in);

        System.out.println("Üç Basamaklı Bir Sayı giriniz: ");
        int say=sc.nextInt();
               System.out.println(say+" sayısının Yüzler Basamağındaki rakam= "+(say/100)+"\n Onlar Basamağındaki Rakam= "+(say/10)%10+"\n Birler Basamağındaki Rakam= "+say%10);
        // OUTPUT:Üç Basamaklı Bir Sayı giriniz:
        //853
        //853 sayısının Yüzler Basamağındaki rakam= 8
        // Onlar Basamağındaki Rakam= 5
        // Birler Basamağındaki Rakam= 3


    }
}

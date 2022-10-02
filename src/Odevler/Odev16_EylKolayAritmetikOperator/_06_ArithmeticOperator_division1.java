package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */

        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();
        double bolum=(double)say1/say2;
        System.out.println(say1+" sayısının "+say2+" ile bölümü:  "+bolum+" dir.");

        // OUTPUT: Birinci tam sayıyı giriniz: 50
        //İkinci tam sayıyı giriniz: 40
        //50 sayısının 40 ile bölümü:  1.25 dir.


    }
}

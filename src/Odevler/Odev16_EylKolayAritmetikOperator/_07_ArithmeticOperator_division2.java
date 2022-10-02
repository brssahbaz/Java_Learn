package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();
        System.out.println(say1+" sayısının "+say2+" ile bölümünün tam sayı kısmı:  "+ say1/say2+" dir.");

        // OUTPUT: Birinci tam sayıyı giriniz: 50
        //İkinci tam sayıyı giriniz: 40
        //50 sayısının 40 ile bölümünün tam sayı kısmı:  1 dir.

    }
}

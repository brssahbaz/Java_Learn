package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();
        System.out.print("Üçüncü tam sayıyı giriniz: ");
        int say3=sc.nextInt();
        System.out.print("Dördüncü tam sayıyı giriniz: ");
        int say4=sc.nextInt();
        System.out.println(say1+", "+say2+", "+say3+" ve "+say4+" sayılarının farkı=  "+(say1-say2-say3-say4)+" dir.");

        // OUTPUT: Birinci tam sayıyı giriniz: 90
        //İkinci tam sayıyı giriniz: 40
        //Üçüncü tam sayıyı giriniz: 10
        //Dördüncü tam sayıyı giriniz: 10
        //90, 40, 10 ve 10 sayılarının farkı=  30 dir.



    }
}

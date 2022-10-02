package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */

        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();
        System.out.println(say1+" ile "+say2+" nin toplamı=  "+(say1+say2)+" dir.");

        // OUTPUT: Birinci tam sayıyı giriniz: 30
        //İkinci tam sayıyı giriniz: 20
        //30 ile 20 nin toplamı=  50 dir.


    }
}

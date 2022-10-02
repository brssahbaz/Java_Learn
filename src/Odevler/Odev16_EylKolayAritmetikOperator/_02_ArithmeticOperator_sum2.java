package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();
        System.out.print("Üçüncü tam sayıyı giriniz: ");
        int say3=sc.nextInt();
        System.out.print("Dördüncü tam sayıyı giriniz: ");
        int say4=sc.nextInt();
        System.out.println(say1+", "+say2+", "+say3+" ve "+say4+" sayılarının toplamı=  "+(say1+say2+say3+say4)+" dir.");

        // OUTPUT: Birinci tam sayıyı giriniz: 10
        //İkinci tam sayıyı giriniz: 20
        //Üçüncü tam sayıyı giriniz: 30
        //Dördüncü tam sayıyı giriniz: 40
        //10, 20, 30 ve 40 sayılarının toplamı=  100 dir.



    }
}

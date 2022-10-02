package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */

        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();
        System.out.print("Üçüncü tam sayıyı giriniz: ");
        int say3=sc.nextInt();

        System.out.println(say1+", "+say2+" ve "+say3+" sayılarının toplamı=  "+(say1+say2+say3)+" dir.");

        // OUTPUT: Birinci tam sayıyı giriniz: 20
        //İkinci tam sayıyı giriniz: 40
        //Üçüncü tam sayıyı giriniz: 50
        //20, 40 ve 50 sayılarının toplamı=  110 dir.




    }
}

package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

         Scanner sc=new Scanner(System.in);
        System.out.print("Birinci ondalık sayıyı giriniz: ");
        double say1=sc.nextDouble();
        System.out.print("İkinci ondalık sayıyı giriniz: ");
        double say2=sc.nextDouble();
        System.out.print("Üçüncü ondalık sayıyı giriniz: ");
        double say3=sc.nextDouble();
        double carpim=say1*say2*say3;

        System.out.println(say1+", "+say2+" ve "+say3+" sayılarının çarpımı=  "+carpim+" dir.");

        // OUTPUT: Birinci ondalık sayıyı giriniz: 5
        //İkinci ondalık sayıyı giriniz: 2
        //Üçüncü ondalık sayıyı giriniz: 12
        //5.0, 2.0 ve 12.0 sayılarının çarpımı=  120.0 dir.







    }
}

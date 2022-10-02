package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci ondalık sayıyı giriniz: ");
        double say1=sc.nextDouble();
        System.out.print("İkinci ondalık sayıyı giriniz: ");
        double say2=sc.nextDouble();
        System.out.print("Üçüncü ondalık sayıyı giriniz: ");
        double say3=sc.nextDouble();
        System.out.print("Dördüncü ondalık sayıyı giriniz: ");
        double say4=sc.nextDouble();
        double carpim=(double)(say1*say2*say3*say4);

        System.out.println(say1+", "+say2+", "+say3+" ve "+say4+" sayılarının çarpımı=  "+carpim+" dir.");

        // OUTPUT: Birinci ondalık sayıyı giriniz: 2
        //İkinci ondalık sayıyı giriniz: 3
        //Üçüncü ondalık sayıyı giriniz: 4
        //Dördüncü ondalık sayıyı giriniz: 5
        //2.0, 3.0, 4.0 ve 5.0 sayılarının çarpımı=  120.0 dir.

    }
}

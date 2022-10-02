package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tam  sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();
        System.out.print("Üçüncü tam sayıyı giriniz: ");
        int say3=sc.nextInt();
        System.out.print("Dördüncü tam sayıyı giriniz: ");
        int say4=sc.nextInt();
        int carpim=(say1*say2*say3*say4);

        System.out.println(say1+", "+say2+", "+say3+" ve "+say4+" sayılarının çarpımı=  "+carpim+" dir.");

// OUTPUT: Birinci tam  sayıyı giriniz: 2
//İkinci tam sayıyı giriniz: 3
//Üçüncü tam sayıyı giriniz: 2
//Dördüncü tam sayıyı giriniz: 5
//2, 3, 2 ve 5 sayılarının çarpımı=  60 dir.

    }
}

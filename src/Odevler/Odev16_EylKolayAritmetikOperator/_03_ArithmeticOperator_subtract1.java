package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */
        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();
        System.out.println(say1+" ile "+say2+" nin farkı=  "+(say1-say2)+" dir.");

        // OUTPUT: Birinci tam sayıyı giriniz: 50
        //İkinci tam sayıyı giriniz: 80
        //50 ile 80 nin farkı=  -30 dir.





    }
}

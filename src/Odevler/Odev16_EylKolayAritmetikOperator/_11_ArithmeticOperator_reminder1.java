package Odevler.Odev16_EylKolayAritmetikOperator;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */

        Scanner sc=new Scanner(System.in);
        System.out.print("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();
        System.out.println(say1+" sayısının "+say2+" ile bölümünden kalan=  "+(say1)%say2+" dir.");

        // OUTPUT: Birinci tam sayıyı giriniz: 14
        //İkinci tam sayıyı giriniz: 3
        //14 sayısının 3 ile bölümünden kalan=  2 dir.

    }
}

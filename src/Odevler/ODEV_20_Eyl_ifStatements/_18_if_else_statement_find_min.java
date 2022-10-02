package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        // 1.YOL:


        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        int i1 = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int i2 = scan.nextInt();
        System.out.println("Üçüncü sayıyı giriniz : ");
        int i3 = scan.nextInt();
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

    /*   if (i1 < i2 && i1<i3) {
            System.out.println("En küçük sayı " + i1 + " dır.");
        } else if (i2 < i3 && i2<i1){
            System.out.println("En küçük sayı " + i2 + " dır.");}
        else // if    (i3 < i1 && i3<i2){
            System.out.println("En küçük sayı " + i3 + " dır.");}

     */


        // 2. YOL:

       // int min1 = i1 < i2 ? i1 : i2;
      // int min2 = i3 < min1 ? i3 : min1;
       // System.out.println("En küçük sayı " + min2 + " dır.");

        // 3. YOL
        int min1, min2;
        if (i1<i2){
            min1=i1;
            if (i3<min1) {min2=i3;
            } else min2=min1;


        }else min1=i2;


    }
}


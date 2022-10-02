package BenimJava.j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
    /*
 byte < short < int < long < float < double
   Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
Java  otomatik olarak yapar.

 */

 //  boolean basarili=true;
 // String basari=basarili; doğal uyum olmayan variablelarda casting yapılmaz
 //       System.out.println("basarili);  true
 //       System.out.println("basari);  true
//
double d=17; // double variable int 17 atandı.
        System.out.println(d); // d=17.0 auto widening

      /*  int sayi1=33;
        int sayi2=7;
        System.out.println(sayi1/sayi2); // 4 java iki int sayiyi böldüğünüzde sonucu int verir.bölmede ondalik sonuc çıkarsa ondalığı siler




        byte b=127;
        int i=b; // küçük büyüğe atandı
        System.out.println("b = " + b);
        int num=1453;
        double d1=num;
        System.out.println("d1 = " + d1); // çıktı: 1453.0

        double db=d1/num;
        System.out.println("db = " + db);//çıktı: db = 1.0 2 farkı data türü sayı işleme girerse sonuç büyük olan  cinsinden olur

*/
     /*
 byte < short < int < long < float < double
 Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
 Java otomatik olarak yapmaz. kod ile teyit ister...

 */

        double d2=14.53;
        int num2= (int) d2;
        System.out.println("num2 = " + num2);
int num3=150;
byte b1= (byte) num3;

        System.out.println("b1 = " + b1); // b1 = -106

        double d3=333;
        long l= (long) d3;
        System.out.println("l = " + l);

        double d4=571.4444;
        long l2= (long) d4;
        System.out.println("l2 = " + l2);
            /* task->
             * Kullanicidan bir character girmesini isteyin ve
             * girilen karakteri ve ascii degerini yazin
             *
             * Ornek : Input  : a
             *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
             *
             *
             */
            Scanner sc=new Scanner(System.in);
            System.out.println("ascii değerini istediğin karakteri giriniz: "); //
            char ch=sc.nextLine().charAt(0);
            int chasciidegeri=ch;
            System.out.println(ch+" ' in asciidegeri = " + chasciidegeri);


    }
}

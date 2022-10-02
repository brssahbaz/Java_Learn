package Odevler.comparisonTasks;

import java.util.Scanner;

public class comparisonTask {

    public static void main(String[] args) {

       /*  /*   Bir integer oluşturun ve değeri 13 olsun.
                Başka bir integer daha oluşturun ve değeri 10 olsun.
                Print kodunun içine Ilk int ,ikinci int'ten büyüktür yazın. (>,< simgeleri ile)
                Console' da 'true' yazısını görmelisiniz.

        //Kodu aşağıya yazınız.

        int a=13, b=10;

        System.out.println(a+" > "+b+" "+((a>b)));

        // OUTPUT: 13 > 10 true

        */

        /*İki ayrı integer oluşturun.
            İlk integerin değeri 17,
            İkinci integerin değeri 20 olsun.
            Print kodunun içine, ilk int ikinci int'ten küçüktür yazın.(<,> simgeleri ile)
            Console'da true yazısını görmelisiniz.

        // Kodu buraya yazınız.

        int a=17, b=20;
        System.out.println(a+" < "+b+" "+((a<b)));

// OUTPUT: 17 < 20 true

         */

        /* İki integer oluştur.
                İkisinin de değeri 13 olsun.
                Print kodunun içine, ilk int ikinci inte küçük veya eşittir yazın ve yazdırın.
                Console'da true yazısını görmelisiniz.
        Örnek:   15>=15

        // Kodu aşağıya yazınız.

        int a=13, b=13;
        System.out.println(a+" <= "+b+" "+((a<=b)));

// OUTPUT:13 <= 13 true

         */
/* Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false

        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.println("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();

        System.out.println(((say1==say2)));

        // OUTPUT:Birinci tam sayıyı giriniz:
        //20
        //İkinci tam sayıyı giriniz:
        //20
        //true
        //Birinci tam sayıyı giriniz:
        //3
        //İkinci tam sayıyı giriniz:
        //4
        //false
         */

        /* Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.

        /*Scanner dp = new Scanner(System.in);

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();

         */

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        Scanner dp = new Scanner(System.in);
        System.out.println("Birinci  sayıyı giriniz: ");
        double num1 = dp.nextDouble();
        System.out.println("İkinci  sayıyı giriniz: ");
        double num2 = dp.nextDouble();
        System.out.println(((num1==num2)));
        // OUTPUT: 12,2
        //İkinci  sayıyı giriniz:
        //12,3
        //false

        // Birinci  sayıyı giriniz:
        // 13,4
        // İkinci  sayıyı giriniz:
        // 13,4
        //true

/* 2 tane String oluşturun.
          String 1 "Apple" String 2 "Apple"
          İlk String'in değeri "Apple" , ikinci String'in değeri de "Apple"  olmalı.
        String1'in String2'ye eşit olduğunu doğrulayın.

        // Kodu aşağıya yazdırınız.

        String word1="Apple";
        String word2="Apple";
        boolean esit;

        System.out.println((esit=(word1==word2)));
        // OUTPUT: true
         */
        /* ki tane float oluşturun. Birinci float 14, ikinci float 17'dir.
            Birinci float'un, ikinci float'dan büyük eşit olduğunu veya  büyük olduğunu yada olmadığını doğrulayın.
            Sonucu yazdırınız.

        //Kodu aşağıya yazınız.

        float a=14f, b=17f;
        System.out.println(((a>=b)||(a>b)));

// OUTPUT: false
         */
        /* 2 double oluşturun.
            İlk double'ın değeri 14.23, ikinci double'ın değeri 19.52 olmalı.
            Double1'in double2'ye eşit olmadığını doğrulayın.
            Eğer eşit değilse cevap true olmalı.
            Cevabı yazdırınız.

        // Kodu aşağıya yazınız.

        double num1 = 14.23;
        double num2 = 19.52;
        System.out.println(((num1!=num2)));

        // OUTPUT: true

         */
/* 2 String oluşturunuz.
          İlk String'in değeri "Techno Study", ikinci String'in değeri de "Techno Study" olsun.
          İlk String'in ikinci String'e eşit olmadığını doğrulayın. örn: (  !=    işareti ile)
          Eğer eşit değilse cevap true, eğer eşitse cevap false olacaktır.
          Cevabı yazdırın.

        //Kodu aşağıya yazınız.


        String word1="Techno Study";
        String word2="Techno Study";

        System.out.println(((word1!=word2)));
        // OUTPUT: false

 */
/* 2 double oluşturun.
          İkisinin de değeri 14.23 olsun.
          Double1'in double2 'den küçük olup olmadığını doğrulayın.(Eğer küçükse konsolda 'true' yazacaktır.)
          Cevabı yazdırın.

        //  Kodu aşağıya yazınız.



        double num1 =14.23;
        double num2 =14.23;
        System.out.println(num1<num2);
        // OUTPUT: false

 */

/* 2 int oluşturun. int 1 'in değeri 120,
        int 2'nin değeri 158 olmalı.
        int 1 'in int 2'den büyük olup olmadığını doğrulayın.
        (Eğer int1, int2'den büyükse konsolda true sonucu vermeli.)
        Cevabı yazdırın.

        // Kodu aşağıya yazınız.


        int a=203, b=158;

        System.out.println(a>b);

        // OUTPUT: true

 */







    }




}

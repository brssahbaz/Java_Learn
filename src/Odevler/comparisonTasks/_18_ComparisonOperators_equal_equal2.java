package Odevler.comparisonTasks;

import java.util.Scanner;

public class _18_ComparisonOperators_equal_equal2 {

    public static void main(String[] args) {

    /*    Oluşturulan double'lar hakkında (num1, num2)
          birbirine eşit olup olmadıklarını doğrulayın.
          Eğer eşitlerse konsolda true yazacaktır.  */

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



    }
}

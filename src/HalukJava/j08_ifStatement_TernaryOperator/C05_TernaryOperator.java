package HalukJava.j08_ifStatement_TernaryOperator;

import java.io.Serializable;
import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {

        // TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen  bir tam sayı giriniz: ");
        int num=sc.nextInt();
      //  Serializable sonuc=(num%2==0) ? (num/2): " Girilen sayı tek olduğundan sonuç tam sayı değildir.";
       System.out.println((num % 2 == 0) ? (num /= 2) : " Girilen sayı tek olduğundan sonuç tam sayı değildir.");
       // System.out.println(num);
        /* TRICK: Ternary iki durum(T/F) için farklı data type çıktısı veriliyorsa atama yapmadan sout yapılmalı.
        Ya da ternary çıktısı aynı data type sterilazition(serializable)  yapılmalı
         */





















    }


}

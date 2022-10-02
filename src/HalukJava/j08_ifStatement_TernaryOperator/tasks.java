package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {

        // TASK02 -> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz: ");
        int num=sc.nextInt();
         String sonuc=(num<0) ?("Negatif"):("Sayı Negatif Değil");
        System.out.println(sonuc);



    }
}

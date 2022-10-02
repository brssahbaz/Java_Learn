package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryClass {
    public static void main(String[] args) {
        // TASK-> girilen bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.
    /*    Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz: ");
        int num=sc.nextInt();
        String sonuc=(num>9 ||num<-9) ? "Sayı 2 veya daha fazla basamaklıdır": " sayı tek basamaklı";
        System.out.println(sonuc);


     */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz: ");
        int num=sc.nextInt();
        String sonuc=(num>0) ? (num>9?"Sayı 2 veya daha fazla basamaklıdır": " sayı tek basamaklı"):"Lütfen Pozitif bir sayı giriniz";
        System.out.println(sonuc);









    }

}

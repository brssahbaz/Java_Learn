package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_Nested_TernaryOperator {
    public static void main(String[] args) {


        // TASK :/*/*
        // Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
        //       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
        // */



        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen  ürün adedini giriniz: ");
        int adt=sc.nextInt();
        System.out.println("Lütfen  ürün fiyatını giriniz: ");
        int fyt=sc.nextInt();
        double fatura=adt*fyt;

        fatura=(adt>100)?fatura*0.67 :fatura;
        System.out.println(fatura);






















    }


}

package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_Nested_TernaryOperator {
    public static void main(String[] args) {

        //  /*
        // TASK :
        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        // */

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen  bir tam sayı giriniz: ");
        int num=sc.nextInt();
        String sonuc=(num>=0)?(num<10? "Rakam":"Rakam değil"):"Negatif Sayi";
        System.out.println(sonuc);






















    }


}

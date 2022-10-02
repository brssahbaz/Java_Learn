package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_Nested_TernaryOperator {
    public static void main(String[] args) {

        //  /*
        // TASK :/*
        //TASK :
        // Girilrn bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
        // 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
        // Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
        // */


        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen  bir tam sayı giriniz: ");
        int num=sc.nextInt();
        String sonuc=(num>=1000&& num<=10000)?"4 Basamaklı":(num%2==0 ? "4 basamaklı olmayan çift sayı":"4 basamaklı olmayan tek sayı yazdırın.");
        System.out.println(sonuc);






















    }


}

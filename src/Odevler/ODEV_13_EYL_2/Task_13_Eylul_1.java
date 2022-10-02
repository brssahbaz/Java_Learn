package Odevler.ODEV_13_EYL_2;

import java.util.Scanner;

public class Task_13_Eylul_1 {
    public static void main(String[] args) {

        //TASK -> 1999 yılında doğan bir kişinin yaşını yazdırınız...

        System.out.println("Yaşınız: "+(2022-1999));



        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        int dogum=sc.nextInt();
        int yas=2022-dogum;
        System.out.println("Yaşınız: "+yas);

        // ÇIKTI: Yaşınız: 23
        //Lütfen doğum yılınızı giriniz: 2000
        //Yaşınız: 22



    }
}

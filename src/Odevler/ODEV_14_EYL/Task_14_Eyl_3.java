package Odevler.ODEV_14_EYL;

import java.util.Scanner;

public class Task_14_Eyl_3 {

    public static void main(String[] args) {
        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...


        Scanner sc=new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunluğunu giriniz: ");
        int kenar=sc.nextInt();
        int cevre=kenar*4;
        int alan=kenar*kenar;
        System.out.println("Kenar uzunluğu "+kenar+" cm olan karenin çevresi:"+cevre+" cm ve alanı: "+alan+" santimetrekaredir.");


        // OUTPUT: Karenin bir kenar uzunluğunu giriniz:
        //6
        //Kenar uzunluğu 6 cm olan karenin çevresi:24 cm ve alanı: 36 santimetrekaredir.



    }
}

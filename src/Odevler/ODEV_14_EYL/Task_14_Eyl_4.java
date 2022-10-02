package Odevler.ODEV_14_EYL;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_14_Eyl_4 {

    public static void main(String[] args) {
        // Task ->/*
        // /*
        // Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
        // Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
        // 1 seker = 1.7 gr
        // Ornek : Input : cay sayisi : 10 seker sayisi :2
        //         Output : Yilda 12.41 kg seker kullaniyorsunuz
        // */


        Scanner sc=new Scanner(System.in);
        System.out.println("Günde kaç bardak çay içiyorsunuz?: ");
        int bardak=sc.nextInt();
        System.out.println("Günde kaç adet şeker kullanıyorsunuz?: ");
        int seker=sc.nextInt();
        double yilseker=(bardak*seker*1.7*0.365);
       //1. yol :  DecimalFormat df=new DecimalFormat("#.##");// girilen sayıyı 2 ondalık basamağa yuvarlar


        //System.out.println("Yılda "+df.format(yilseker)+" kg seker kullanıyorsunuz.");
             System.out.format("%.2f", yilseker);// 2. yöntem

        // OUTPUT: Günde kaç bardak çay içiyorsunuz?:
        //10
        //Günde kaç adet şeker kullanıyorsunuz?:
        //2
        //Yılda 12.41 kg seker kullanıyorsunuz.



    }
}

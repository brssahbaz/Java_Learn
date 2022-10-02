package Odevler.introductionToJavaExercises.evennumberedexercise;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int yil=sc.nextInt();
       // (num%2==0 && num%3==0)? ("girdiğiniz "+num+ " sayısı 6 ile bölünür"):((num%2==0 || num%3==0)?("girdiğiniz "+num+ " sayısı 2 veya 3 ile bölünür"):(num%2==0 && num%3!=0):("girdiğiniz "+num+ " sayısı 2 ile bölünür ama 3veya 3 ile bölünmez"));

        if ((yil%4==0 && yil%100!=0)|| (yil%400==0)){

            System.out.println("girdiğiniz "+yil+ " yılı artık yıldır.");


        }  else

            System.out.println("girdiğiniz " + yil + " artık yıl değildir.");










    }

}

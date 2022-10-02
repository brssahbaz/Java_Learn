package Odevler.introductionToJavaExercises.evennumberedexercise;

import java.util.Scanner;

public class dividedBy2and3 {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=sc.nextInt();
       // (num%2==0 && num%3==0)? ("girdiğiniz "+num+ " sayısı 6 ile bölünür"):((num%2==0 || num%3==0)?("girdiğiniz "+num+ " sayısı 2 veya 3 ile bölünür"):(num%2==0 && num%3!=0):("girdiğiniz "+num+ " sayısı 2 ile bölünür ama 3veya 3 ile bölünmez"));

        if (num%2==0 && num%3==0) {

            System.out.println("girdiğiniz "+num+ " sayısı 6 ile bölünür");


        }  if (num%2==0 || num%3==0) {

            System.out.println("girdiğiniz " + num + " sayısı 2 veya 3 ile bölünür");

        } if (num%2==0 && num%3!=0)  {

            System.out.println("girdiğiniz " + num + " sayısı 2 ile bölünür ama  3 ile bölünmez");

        }







    }

}

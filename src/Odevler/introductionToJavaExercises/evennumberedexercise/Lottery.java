package Odevler.introductionToJavaExercises.evennumberedexercise;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {


        int lottery=(int) (Math.random()*100);
        System.out.println(lottery);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a guess: ");
        int guess=sc.nextInt();
        int lottery1=lottery/10;
        int lottery2=lottery%10;
        int guess1=guess/10;
        int guess2=guess%10;


        if ((guess1==lottery1 && guess2==lottery2)){

            System.out.println("Büyük Ödülü kazandınız.");


        }  else if((guess2==lottery1 && guess1==lottery2)){

            System.out.println("Küçük Ödülü kazandınız.");

         } else if (guess1==lottery1||guess1==lottery2||guess2==lottery1||guess2==lottery2) {

            System.out.println("Amorti kazandınız.");
        }
    }

}

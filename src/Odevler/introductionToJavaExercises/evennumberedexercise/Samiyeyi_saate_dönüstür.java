package Odevler.introductionToJavaExercises.evennumberedexercise;

import java.util.Scanner;

public class Samiyeyi_saate_dönüstür {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println( "Enter an integer for seconds: ");
    int seconds=sc.nextInt();
    int hour=seconds/3600;
    int minute=(seconds/3600)%60;
    int remainingseconds=seconds-(hour*3600+minute*60);
    System.out.println(seconds+" seconds is "+hour+" hours "+minute+" minutes and "+remainingseconds+" seconds");
    long mii=System.currentTimeMillis();



























  }
}

package Odevler.introductionToJavaExercises.evennumberedexercise;

import java.util.Scanner;

public class RandomTwoİnteger {
  public static void main(String[] args) {

    /*  long miliSeconds=System.currentTimeMillis();
      long totalSeconds=miliSeconds/1000;
      long currentSeconds=totalSeconds%60;
    long totalMinutes=totalSeconds/60;
    long currentMinutes=totalMinutes%60;
    long hours=currentMinutes/60;
    long currentHours=hours%24;
    System.out.println(currentHours+":"+currentMinutes+":"+currentSeconds);

     */



    int num1=(int) (Math.random()*20);
    int num2=(int) (Math.random()*20);
    System.out.println(num1+","+num2);
    if (num1<num2) {
      int temp=num1;
      num1=num2;
      num2=temp;
      System.out.println(num1);
      System.out.println(num2);

    }
    System.out.println(num1+" - "+num2+" = ?");
    Scanner sc=new Scanner(System.in);
    int answer=sc.nextInt();
    System.out.println((num1-num2==answer)?"Your answer is correct":"Your answer is incorrect");

























  }
}

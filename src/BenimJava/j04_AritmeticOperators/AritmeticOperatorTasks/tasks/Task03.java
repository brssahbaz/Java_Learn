package BenimJava.j04_AritmeticOperators.AritmeticOperatorTasks.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */


		Scanner sc= new Scanner(System.in);

		System.out.println("Üç Basamaklı Bir Sayı giriniz: ");
		int say=sc.nextInt();
						System.out.println(say+" sayısının ilk ve son rakamlarının toplamı= "+(say/100+say%10));





	}

}

package Odevler.ODEV_16_EylAritmeticOperators;

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
		System.out.println(say+" sayısının Yüzler Basamağındaki rakam= "+(say/100)+"\n Onlar Basamağındaki Rakam= "+(say/10)%10+"\n Birler Basamağındaki Rakam= "+say%10);
		// OUTPUT: Üç Basamaklı Bir Sayı giriniz:
		//123
		//123 sayısının ilk ve son rakamlarının toplamı= 4
		//123 sayısının Yüzler Basamağındaki rakam= 1
		// Onlar Basamağındaki Rakam= 2
		// Birler Basamağındaki Rakam= 3


	}

}

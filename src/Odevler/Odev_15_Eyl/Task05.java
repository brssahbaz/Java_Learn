package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner sc=new Scanner(System.in);
		System.out.print("İki tam sayı giriniz: ");
		int say1=sc.nextInt();
		int say2=sc.nextInt();
		int topla=say1+say2;
		int fark=say1-say2;
		int carp=say1*say2;
		float bol=(float) say1/say2;

		System.out.println("Girdiğiniz: "+say1+" ve "+say2+" sayılarının "+"toplamı= "+topla+", farkı= "+fark+", çarpımı= "+carp+", bölümü= "+bol+" dir.");

		// OUTPUT: İki tam sayı giriniz: 50
		//40
		//Girdiğiniz: 50 ve 40 sayılarının toplamı= 90, farkı= 10, çarpımı= 2000, bölümü= 1.25 dir.


	}

}

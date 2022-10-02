package Odevler.SwitchCase_Tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz


		Scanner scan = new Scanner(System.in);

		System.out.print("VIP (Very Important Person) Kısaltmasında  Hangi Harfin Kelime Karşılığını Öğrenmek İstiyorsunuz? ");
		char vip = scan.next().toLowerCase().charAt(0);

		switch (vip) {

			case 'v':
				System.out.println("Very");
				break;
			case 'i':
				System.out.println("Important");
				break;
			case 'p':
				System.out.println("Person");
				break;
			default:
				System.out.println("Hatalı Giriş Yaptınız.Lütüfen V, I veya P Harflerinden Birini Giriniz.");


		}
	}










}

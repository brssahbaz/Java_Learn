package Odevler.SwitchCase_Tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Bulunduğunuz ayın adını giriniz.");
		String secim = sc.nextLine().toLowerCase();
		switch (secim) {
			case "ocak":
			case "mart":
			case "mayıs":
			case "temmuz":
			case "ağustos":
			case "ekim":
			case "aralık":
				System.out.println("Girilen ay 31 gündür.");
				break;
			case "nisan":
			case "haziran":
			case "eylül":
			case "kasım":
				System.out.println("Girilen ay 30 gündür.");
				break;
			case "şubat":
				System.out.print("yılınızı giriniz : ");
				int yil=sc.nextInt();
				if (yil % 4 == 0) {
					System.out.println("Girilen subat ayı 29 gün içerir ");
				} else System.out.println("Girilen ay subat ayı 28 gün içerir");
				break;
			default:
				System.out.println("Hatalı Giriş Yaptınız.Lütfen Bulunduğunuz Ayın Adını Doğru Giriniz.");


		}

	}

}

package HalukJava.j09_SwitchStatement;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class C01_switchCase {
    public static void main(String[] args) {

/*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */
        //Task--> Kullanıcının girdiği rakamı yazı ile print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir rakam giriniz.");
        int secim=sc.nextInt();
        switch (secim) {
            case 0:
                System.out.println("Sıfır yazdınız.");
                break;
            case 1:
                System.out.println("Bir yazdınız.");
                break;
            case 2:
                System.out.println("iki yazdınız.");
                break;
            case 3:
                System.out.println("Üç yazdınız.");
                break;
            case 4:
                System.out.println("Dört yazdınız.");
                break;
            case 5:
                System.out.println("Beş yazdınız.");
                break;
            case 6:
                System.out.println("Altı yazdınız.");
                break;
            case 7:
                System.out.println("Yedi yazdınız.");
                break;
            case 8:
                System.out.println("Sekiz yazdınız.");
                break;
            case 9:
                System.out.println("Dokuz yazdınız.");
                break;
            default:
                System.out.println("Lütfen rakam giriniz.");





        }


    }
}

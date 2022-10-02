package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class C02_switchCase {
    public static void main(String[] args) {
       // TASK--> Kullanıcının girdiği ayın sırasına göre ayın ismini print eden code yazınız




        Scanner sc=new Scanner(System.in);
        System.out.println("Bulunduğunuz ayın yılın kaçıncı ayı olduğunu giriniz.");
        int secim=sc.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Ocak ayındasınız");
                break;
            case 2:
                System.out.println("Şubat ayındasınız");
                break;
            case 3:
                System.out.println("Mart ayındasınız");
                break;
            case 4:
                System.out.println("Nisan ayındasınız");
                break;
            case 5:
                System.out.println("Mayıs ayındasınız");
                break;
            case 6:
                System.out.println("Haziran ayındasınız");
                break;
            case 7:
                System.out.println("Temmuz ayındasınız");
                break;
            case 8:
                System.out.println("Ağustos ayındasınız");
                break;
            case 9:
                System.out.println("Eylül ayındasınız");
                break;
            case 10:
                System.out.println("Ekim ayındasınız");
                break;
            case 11:
                System.out.println("Kasım ayındasınız");
                break;
            case 12:
                System.out.println("Aralık ayındasınız");
                break;
            default:
                System.out.println("Lütfen 1 ile 12 arasında bir sayı giriniz");


        }














        }
}

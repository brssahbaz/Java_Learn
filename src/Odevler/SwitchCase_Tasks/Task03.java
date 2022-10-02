package Odevler.SwitchCase_Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız


        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacinciGun = scan.nextInt();
        switch (kacinciGun) {

            case 1:
                System.out.println("Bugün Pazartesidir.");
                break;
            case 2:
                System.out.println("Bugün Salıdır.");
                break;
            case 3:
                System.out.println("Bugün Çarşambadır.");
                break;
            case 4:
                System.out.println("Bugün Perşembedir.");
                break;
            case 5:
                System.out.println("Bugün Cumadır.");
                break;
            case 6:
                System.out.println("Bugün Cumartesidir.");
                break;
            default:
                System.out.println("Bugün Pazardır.");


        }


    }
}

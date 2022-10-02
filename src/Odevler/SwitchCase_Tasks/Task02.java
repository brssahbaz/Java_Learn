package Odevler.SwitchCase_Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int bugun= scan.nextInt();
        System.out.println("Bugünden sonra kaçıncı günü hesaplamak istiyorsunuz?");
        switch (bugun){

            case 1:
                System.out.println("Bugün Pazartesi  olduğundan, 100 gün sonrası "+" Çarşambadır.");
                break;
            case 2:
                System.out.println("Bugün Salı  olduğundan, 100 gün sonrası "+" Perşembedir.");
                break;
            case 3:
                System.out.println("Bugün Çarşamba  olduğundan, 100 gün sonrası "+" Cumadır.");
                break;
            case 4:
                System.out.println("Bugün Perşembe  olduğundan, 100 gün sonrası "+" Cumartesidir.");
                break;
            case 5:
                System.out.println("Bugün Cuma  olduğundan, 100 gün sonrası "+" Pazardır.");
                break;
            case 6:
                System.out.println("Bugün Cumartesi  olduğundan, 100 gün sonrası "+" Pazartesidir.");
                break;
            default:
                System.out.println("Bugün Pazar  olduğundan, 100 gün sonrası "+" Salıdır.");
                break;


        }

    }
}


package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchStatement_ATM_Project {
    public static void main(String[] args) {
        // TASK: Başlangıç bakiyesi 1000 tl olan atm den bakiye öğrenme, para yatıröa ve çekme, çıkış işlemlerinin yapıldığı atm app code creat ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("  ***   ");
        System.out.println("  ATM ye Hoş Geldiniz.   ");
        System.out.println("Bakiye öğrenme için -->1\nPara Yatırma için -->2\nPara ÇEekme-->3\nÇıkış --> 4\nGiriniz");
        int secim = sc.nextInt();
        int bakiye=1000;
        switch (secim) {
            case 1:
                System.out.println( "Bakiyeniz: "+bakiye);
                break;
            case 2:
                System.out.println("Yatırmak istediğiniz Para miktarını Giriniz");
                int yatirilanMiktar=sc.nextInt();
                bakiye+=yatirilanMiktar;
                System.out.println("Güncel Bakiyeniz: "+bakiye);

                break;
            case 3:
                System.out.println("Çekmek istediğiniz Para miktarını Giriniz: ");
                int cekilenMiktar=sc.nextInt();
                              if (cekilenMiktar>bakiye) {
                    System.out.println("Yetersiz Bakiye.");
                    System.out.println("Güncel Bakiyeniz: "+bakiye);
                }else{  bakiye-=cekilenMiktar;
                System.out.println("Güncel Bakiyeniz: "+bakiye);}

                break;
            case 4:
                System.out.println("Çıkışınız yapıldı.Teşekkürler.");
                break;
            default:
                System.out.println("Hatalı Seçim Girdiniz.Tekrar Deneyiniz.");
        }





















    }


}

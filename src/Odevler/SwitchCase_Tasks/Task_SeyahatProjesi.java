package Odevler.SwitchCase_Tasks;

import java.util.Scanner;

public class Task_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("***** seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi
        double paraustu, odeme;
        switch (hedef){
            case "FRANKFURT":
                int ucretFrankfurt=12;
                System.out.println("Rota: Frankfurt\nFrankfurt: 12 Euro.");
                System.out.println("Kaç Kişilik Bilet İstiyorsunuz?: (Maksimum 2 Kişilik Olabilir.");
                int kisif= scan.nextInt();
                int biletfytf=ucretFrankfurt*kisif;
                System.out.println(kisif+" Kişilik Bilet\n"+kisif+" Kişilik Bilet Fiyatı= "+biletfytf+" Euro");
                System.out.println("Ödeme Yapmak istediğiniz Para Miktarını Euro Olarak Giriniz:");
                odeme= scan.nextDouble();
                if (odeme>=biletfytf) {
                    paraustu=odeme-biletfytf;
                    System.out.println("Ödeme Yaptığınız İçin Teşekkürler\nPara Üstü= "+paraustu+" Euro");

                } else System.out.println(kisif+ " Kişilik Bilet Almak için  Yetersiz Bakiye.");

                break;

            case "KOLN":

                int ucretKoln=20;
                System.out.println("Rota: Koln\nKoln: 20 Euro.");
                System.out.println("Kaç Kişilik Bilet İstiyorsunuz?: (Maksimum 2 Kişilik Olabilir.");
                int kisik= scan.nextInt();
                int biletfytk=ucretKoln*kisik;
                System.out.println(kisik+" Kişilik Bilet\n"+kisik+" Kişilik Bilet Fiyatı= "+biletfytk+" Euro");
                System.out.println("Ödeme Yapmak istediğiniz Para Miktarını Euro Olarak Giriniz:");
                odeme= scan.nextDouble();
                if (odeme>=biletfytk) {
                    paraustu=odeme-biletfytk;
                    System.out.println("Ödeme Yaptığınız İçin Teşekkürler\nPara Üstü= "+paraustu+" Euro");

                } else System.out.println(kisik+ " Kişilik Bilet Almak için  Yetersiz Bakiye.");


                break;









            default:System.out.println("Hatalı Giriş Yaptınız.Lütfen Frankfurt veya Koln Şehirlerinden Birini Seçiniz . ");
        }























    }
}

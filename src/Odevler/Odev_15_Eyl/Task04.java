package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Adınızı Soyadınızı Giriniz: ");
        String name=sc.nextLine();
        System.out.print("Yaşınızı Giriniz: ");
        int yas=sc.nextInt();
        System.out.print("Kilonuzu Giriniz: ");
        double kilo=sc.nextDouble();
        System.out.print("Boyunuzu Giriniz: ");
        double boy=sc.nextDouble();
        System.out.print("Salonumuza Kaç Ay Devam Edeceksiniz: ");
        int ay=sc.nextInt();
        System.out.println("Adınızı Soyadınız: "+name+", Yaşınız: "+yas+",Kilonuz : "+kilo+" Boyunuz: "+boy+" Üyelik Ücretiniz: "+20*ay+" $ dır");





        // OUTPUT:Adınızı Soyadınızı Giriniz: Barish un
        //Yaşınızı Giriniz: 45
        //Kilonuzu Giriniz: 80
        //Boyunuzu Giriniz: 180
        //Salonumuza Kaç Ay Devam Edeceksiniz: 10
        //Adınızı Soyadınız: Barish un, Yaşınız: 45,Kilonuz : 80.0 Boyunuz: 180.0 Üyelik Ücretiniz: 200 $ dır







    }
}

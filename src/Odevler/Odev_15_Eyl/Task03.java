package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner sc=new Scanner(System.in);
        System.out.print("Günde kaç saat uyuyorsunuz?: ");
        int gun=sc.nextInt();
        int yil=(int) gun*365/24; // int yil=Math.round(gun*365/24) ( yuvarlama)

        System.out.println("Ayda: "+gun*30/24+", yılda: "+yil+" ve 40 yılda toplam "+ 40*yil+" gününüz uykuda geçiyor.");

        // OUTPUT:Günde kaç saat uyuyorsunuz?: 7
        //Ayda: 8, yılda: 106 ve 40 yılda toplam 4240 gününüz uykuda geçiyor.




    }
}

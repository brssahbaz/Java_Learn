package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */

        Scanner sc=new Scanner(System.in);
        System.out.println("On sene Önce Yaşadığınız Şehrin Adını Giriniz: ");
        String shr=sc.nextLine();
        System.out.println("On sene Önce Yaşadığınız Şehir: " + shr);

// OUTPUT: On sene Önce Yaşadığınız Şehrin Adını Giriniz:
//istanbul
//On sene Önce Yaşadığınız Şehir: istanbul

    }
}

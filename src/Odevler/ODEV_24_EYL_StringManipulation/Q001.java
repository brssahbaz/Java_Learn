package Odevler.ODEV_24_EYL_StringManipulation;

import java.util.Scanner;

public class Q001 {
    public static void main(String[] args) {
        // TASK :  // TASK: Giirlen e-mail hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        //        // @gmail.com ile biriyorsa "hesabınız onaylandı" aksi durumda geçerli hesap giriniz print eden code create ediniz.



        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen e-mail adresinizi giriniz.");
        String email = sc.nextLine().toLowerCase();

        String gmail = "@gmail.com";
        if ((!email.contains(gmail))) {
            System.out.println("lütfen gmail hesabı giriniz");

        } else System.out.println((email.endsWith(gmail)?"Hesabınız onaylandı.":"Geçerli bir gmail hesabı giriniz."));


    }
}


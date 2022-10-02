package HalukJava.j10_StringManipulations.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        /* TASK: Aşağıdaki passwordun şartlarını sağlamasını kontrol eden code create edin
        a) ilk karakteri büyük harf olmalı
         b)son karakteri sayı olmalı
         c) en az 6 karakter uuznluğunda olmalı

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz : ");
        String password= scan.nextLine();

        if ((password.charAt(0)>='A' && password.charAt(0)<='Z') // a şartı
                && (password.charAt(password.length()-1)>='0' // b şart
                && password.charAt(password.length()-1)<='9')&& (password.length()>=6)) { // c şartı

            System.out.println("Şifreniz geçerli.");



        } else System.out.println("Geçerli password giriniz");




















       /*  if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z') {

            if (sifre.charAt(sifre.length()-1)>='0') && (sifre.charAt(sifre.length()-1)>='9') {
               if (sifre.length()>=6) {

                   System.out.println("şifre dogru");
               }
            }

        } else System.out.println("ilk karakteri büyük harf olmalı");

        */





































    }
}

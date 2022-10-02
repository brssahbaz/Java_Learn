package Odevler.ODEV_24_EYL_StringManipulation;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir üç harfli bir kelime Giriniz.");
        String word = sc.nextLine().toLowerCase();
        if (word.length()==3){
            char chr1=word.charAt(0);
            char chr2=word.charAt(1);
            char chr3=word.charAt(2);
        System.out.println((chr1 == chr2 || chr1 == chr3 || chr2 == chr3) ? "Girdiğiniz kelimede aynı harfler vardır" : "Girdiğiniz kelimede  harfler birbirinden farklıdır.");

        } else System.out.println("Girdiğiniz kelime üç harfden oluşmamaktadır.Lütfen üç harfli bir kelime giriniz.");

        // OUTPUT: Bir üç harfli bir kelime Giriniz.
        //ASDE
        //Girdiğiniz kelime üç harfden oluşmamaktadır.Lütfen üç harfli bir kelime giriniz.
        // Bir üç harfli bir kelime Giriniz.
        //AS
        //Girdiğiniz kelime üç harfden oluşmamaktadır.Lütfen üç harfli bir kelime giriniz.




    }
}
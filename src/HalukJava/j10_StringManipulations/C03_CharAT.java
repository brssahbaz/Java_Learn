package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAT {
    public static void main(String[] args) {
        /**charAT() methodu parametre int olarak girilen indexleri char değerini return eder.
         * index değeri 0 dan başlar
         *
         *
         *
         */

        String sehir = "Istanbul";
        char besinciIndexKrktr = sehir.charAt(5);
        System.out.println(besinciIndexKrktr);
// son index karakteri--> length()-1 dir
        System.out.println(sehir.charAt(sehir.length() - 1));
// TASK: KELİMENİN ortasındaki karakteri print eden code creat edin
        Scanner scan = new Scanner(System.in);
        System.out.println(" Bir kelime girin: ");
        String kelime = scan.nextLine();
        if (kelime.length() % 2 ==1) {
            System.out.println(kelime.charAt((kelime.length() - 1) / 2));

        } else System.out.println("Girilen kelimenin orta karakteri yoktur.");
    }

 }


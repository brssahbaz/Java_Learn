package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_Example_2 {
    public static void main(String[] args) {
// girilen sayının pozitif negatif olduğunu kontrol etme edin
/*/*
 Kullanicidan 100 uzerinden notunu isteyin.
 Not'u harf sistemine cevirip yazdirin.
 50’den kucukse "D",
 =50  <60 arasi "C",
 =60  <80 arasi "B",
 =80’nin uzerinde ise "A"
 */




        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 100 üzerinden notunuzu giriniz: ");
        int not = sc.nextInt();
        if (not >= 0 && not <= 100) {
            if (not >= 80) {
                System.out.println("Notunuz \"A\".");
            } else if (not >= 60) {
                System.out.println("Notunuz \"B\".");

            } else if (not >= 50) {
                System.out.println("Notunuz \"C\".");
            } else System.out.println("Notunuz \"D\".");
        } else System.out.println("Geçersiz bir not girdiniz.");

    }
}

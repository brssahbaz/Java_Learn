package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

/* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

       Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz: ");
        int num=sc.nextInt();


      //  String sonuc=(num%2==0) ?("Çift"):("Tek");

      //  System.out.println(sonuc);

        System.out.println((num % 2 == 0) ? ("Çift") : ("Tek"));
 // TRICK: ŞAYET Sadece 1 kez kullanacaksan sout ile de yazırılabilir.




    }
}

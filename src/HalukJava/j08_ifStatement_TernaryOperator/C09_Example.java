package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C09_Example {

    public static void main(String[] args) {
    /*
    TASK--> Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
Eger 10 dan buyuk ise "Buyuksun!" yazdirin
Eger 10 dan kucuk ise "Normalsin!" yazdirin

Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
Eger -10 dan buyuk ise "Negatifsin!" yazdirin
Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirinrim gününü print eden code reate ediniz
    */
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz.");
        int say = sc.nextInt();
        if (say > 10) {
            System.out.println("Büyüksün.");


        }else if (say > 0) {

            System.out.println("Normalsin.");
        }else if (say ==0) {
            System.out.println(" sıfır dışında bir tam sayı giriniz.");

        } else if (say >= -10) {
            System.out.println("Negatifsin.");
        } else System.out.println("Çok negatifisiniz.");







         /*     if (say >= 10) {
                System.out.println("Büyüksün.");
            } else System.out.println("Normalsin.");

        } else if (say >= -10) {
            System.out.println("Negatifsin.");

            } else System.out.println("Çok negatifisiniz.");

    else if (say < -10) {System.out.println(" sıfır dışında bir tam sayı giriniz.");

          */




    }

}

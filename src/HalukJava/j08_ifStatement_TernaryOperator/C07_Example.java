package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_Example {

    public static void main(String[] args) {
    /*
    TASK--> Kuualanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create edinizni kontrol edip kalan yıl ve prim gününü print eden code reate ediniz
    */
        Scanner    sc=new Scanner(System.in)    ;

        System.out.println("Ehiyetiniz var mı?\n Varsa  --> E\n Yoksa --> H\n giriniz.)");
        char ehlyt=sc.next().toUpperCase().charAt(0);
        if (ehlyt=='E') {
            System.out.println("Kaç yıllık tecrübeniz var? ");

            int tcrb=sc.nextInt();
            if (tcrb>=7) {
                System.out.println("Kaç km yol yaptınız? ");
                int km=sc.nextInt();
                if (km>=100000) {
                    System.out.println("İş başvurunuz kabul edilmiştir.");

                }else System.out.println("İşe başvura yapabilmeniz için "+(100000-km)+" km yapmanız gerekiyor.");

            }else System.out.println("İşe başvura yapabilmeniz için "+(7-tcrb)+" yıla ihtiyacınız var.");

        }else if (ehlyt=='E'){
            System.out.println("Ehliyetiniz olmadığından işe giremediniz. :(");
        } else System.out.println("E veya H  giriniz.");














    }

}

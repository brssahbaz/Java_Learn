package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner sc=new Scanner(System.in);
        System.out.print("Dik Üçgenin  dik kenarlarının uzunluklarını giriniz: ");
        int dik1=sc.nextInt();
        int dik2=sc.nextInt();
        float hipo=(float) Math.sqrt(dik1*dik1+dik2*dik2);

        System.out.println("Hipotenüs= "+hipo);

// OUTPUT: Dik Üçgenin  dik kenarlarının uzunluklarını giriniz: 4
//2
//Hipotenüs= 4.472136



    }
}

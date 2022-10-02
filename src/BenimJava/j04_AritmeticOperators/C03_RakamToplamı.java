package BenimJava.j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Üç Basamaklı Bir Sayı giriniz: ");
        int say=sc.nextInt();
        int birler=say %10;
        say/=10;  //onlar=(say/10)%10; sayının 10 ile bölümünden bölümü verir
        int onlar=say%10; // 85 in 10 ile bölümündne kalan
        int yuzler=say/10; // 85 in 10 ile bölümünü veriir.


        int topla=say+onlar+yuzler;

        System.out.println("Girdiğiniz sayınınrakamlar toplamı= "+topla);


    }




}


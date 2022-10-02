package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_Example {

    /*
    TASK--> Girilen bir karakterin harf olup olmadığını kontrol eden code create ediniz

    A-->Z,

     */

    public static void main(String[] args) {

        Scanner    sc=new Scanner(System.in)    ;

        System.out.println("Bir karakter giriniz: ");

        char ch=sc.nextLine().charAt(0);
        if ((ch>='A'&& ch<='Z' )||(ch>='a'&& ch<='z' )){
            System.out.println("Girdiğiniz karakter harftir. :) ");


        } else System.out.println("Girdiğiniz karakter harft değildir. :( ");





























    }

}

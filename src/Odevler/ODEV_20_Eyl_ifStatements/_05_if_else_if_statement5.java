package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        double num1 = sc.nextDouble();
        System.out.println("İkinci sayıyı giriniz : ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("Hello World");
        } else if (num1 < num2) System.out.println("Not Hello World");
        else System.out.println("I love java");
        // OUTPUT: Birinci sayıyı giriniz :
        //90,25
        //İkinci sayıyı giriniz :
        //90,25
        //I love java







    }
}

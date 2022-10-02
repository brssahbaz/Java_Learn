package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

        // c = (f-32)*5/9

        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen Sıcaklığı Fahrenheit olarak giriniz: ");
        double fah=sc.nextDouble();
        System.out.print("Hava Sıcaklığı : "+(fah-32)*5/9+" derecedir.");
    }




}

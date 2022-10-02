package HalukJava.J11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // task girilen 3 notun ortalamsını hesaplayan method creat ediniz

        Scanner sc=new Scanner(System.in);
        System.out.print("1. notunuzu giriniz:");
        double not1=sc.nextDouble();

        System.out.print("2. notunuzu giriniz:");
        double not2=sc.nextDouble();

        System.out.print("3. notunuzu giriniz:");
        double not3=sc.nextDouble();

        double ortalamaniz=ortalamaHesapla(not1,not2,not3);
        System.out.println("Not ortalamanız: "+ortalamaniz);
    }// main sonu

    public static double ortalamaHesapla(double a, double b, double c) {

        return ((a+b+c)/3);

    }


}

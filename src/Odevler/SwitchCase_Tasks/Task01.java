package Odevler.SwitchCase_Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Üç basamaklı Pozitif Bir Sayi Giriniz = ");
        int sayi = sc.nextInt();
        int onlar = (sayi / 10) % 10;
        System.out.println(onlar);

        switch (onlar) {
            case 0:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  sıfırdır.");
                break;
            case 1:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  birdir.");
                break;
            case 2:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  ikidir.");
                break;
            case 3:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  üçtür.");
                break;
            case 4:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  dörttür.");
                break;
            case 5:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  beştir.");
                break;
            case 6:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  altıdır.");
                break;
            case 7:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  yedidir.");
                break;
            case 8:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  sekizdir.");
                break;
            default:
                System.out.println("Girdiğiniz " + sayi + " Sayısının onlar basamağı  dokuzdur.");
                break;
        }

    }


}

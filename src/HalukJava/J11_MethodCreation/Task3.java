package HalukJava.J11_MethodCreation;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // TASK:   Girilen 2 sayıyı seçilen 4 işleme göre hesaplayan method creat ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        int sayi1 = sc.nextInt();

        System.out.println("2. sayıyı giriniz:");
        int sayi2 = sc.nextInt();
        System.out.println("yapmak istediğiniz işlemi seçiniz:  ");
       char islem = sc.next().charAt(0);
islemMenu(islem,sayi1,sayi2);

    }// main sonu

    public static void islemMenu(char ch, int x, int y) {
        switch (ch) {
            case '+':
                topla(x,y);

                break;
            case '-':
                cikar(x,y);
                break;
            case '*':
                carp(x,y);
                break;
            case '/':
                bol(x,y);
                break;
            default :
                System.out.println("Hatalı seçim yaptınız");
        }





    }




  public static void topla(int a,int b) {
      System.out.println("a+b= "+(a+b));

  }
    public static void carp(int a,int b) {
        System.out.println("a*b= "+(a*b));

    }
    public static void bol(int a,int b) {
        System.out.println("a/b= "+(a/b));

    }
    public static void cikar(int a,int b) {
        System.out.println("a-b= "+(a-b));

    }



}

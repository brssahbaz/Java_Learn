package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class C03_switchCase {
    public static void main(String[] args) {
        // TASK--> Giirlen ay numarasına göre kaç gün çektiğini print eden kod create ediniz


        Scanner sc = new Scanner(System.in);
        System.out.println("Bulunduğunuz ayın yılın kaç gün olduğunu giriniz.");
        int secim = sc.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Girilen ay 31 gündür.");
                break;
            case 3:
                System.out.println("Girilen ay 31 gündür.");
                break;
            case 5:
                System.out.println("Girilen ay 31 gündür.");
                break;
            case 7:
                System.out.println("Girilen ay 31 gündür.");
                break;
            case 8:
                System.out.println("Girilen ay 31 gündür.");
                break;
            case 10:
                System.out.println("Girilen ay 31 gündür.");
                break;
            case 12:
                System.out.println("Girilen ay 31 gündür.");
                break;

                          default:
                System.out.println("Lütfen 1 ile 12 arasında bir sayı giriniz");
        }

    }
}

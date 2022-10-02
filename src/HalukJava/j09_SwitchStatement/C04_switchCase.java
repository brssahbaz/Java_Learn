package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class C04_switchCase {
    public static void main(String[] args) {
// TASK: Girilen ayın hangi mesimde oldğunu print eden code create ediniz


        Scanner sc = new Scanner(System.in);
        System.out.println("Bulunduğunuz ayı giriniz.");
        int secim = sc.nextInt();
        switch (secim) {
            case 12:

            case 1:

            case 2:
                System.out.println("Kış mevimindesiniz");
                break;
            case 3:

            case 4:

            case 5:
                System.out.println("İlk bahar mevimindesiniz");
                break;
            case 6:

            case 7:

            case 8:
                System.out.println("Yaz mevimindesiniz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar mevimindesiniz");
            default:
                System.out.println("Lütfen 1 ile 12 arasında bir sayı giriniz");


        }


    }
}

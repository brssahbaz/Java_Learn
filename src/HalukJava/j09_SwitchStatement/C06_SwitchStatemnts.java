package HalukJava.j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchStatemnts {
    public static void main(String[] args) {

        // TASK: Giirlen haftanın gününü hafta içi veya hafta sonu olduğunu print eden code create ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Gün giriniz.");
        String secim=sc.next().toLowerCase();
        switch (secim) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta içindesiniz");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonundasınız");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");








        }





































    }

}

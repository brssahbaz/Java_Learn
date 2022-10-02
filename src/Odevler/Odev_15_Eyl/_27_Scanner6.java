package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    kullanıcının
          Doğum gününü print eden code create ediniz */

        Scanner sc=new Scanner(System.in);
        System.out.println("Doğum Tarihinizi Giriniz: ");
        String dgm=sc.nextLine();
        System.out.println("Doğum Tarihiniz: " + dgm);

// OUTPUT: Doğum Tarihinizi Giriniz:
//12.08.2000
//Doğum Tarihiniz: 12.08.2000

    }
}

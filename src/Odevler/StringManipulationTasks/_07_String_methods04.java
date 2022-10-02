package Odevler.StringManipulationTasks;

import java.util.Scanner;

public class _07_String_methods04 {

    public static void main(String[] args) {

        /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */

        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String str = scan.nextLine();
        System.out.println(str.toLowerCase());
  // OUTPUT: Bir string giriniz = APPLE
        //apple

    }
}

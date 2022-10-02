package Odevler.StringManipulationTasks;

import java.util.Scanner;

public class _06_String_methods03 {

    public static void main(String[] args) {

    /*    paper olan bir String oluşturun.
          String'i büyük harfe çevirin ve yazdırın.
          örn: apple > APPLE   */

        //Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String str = scan.nextLine();
        System.out.println(str.toUpperCase());

        // OUTPUT:  Bir string giriniz = apple
        //APPLE








    }
}

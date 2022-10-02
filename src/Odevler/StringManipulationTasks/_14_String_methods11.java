package Odevler.StringManipulationTasks;

import java.util.Scanner;

public class _14_String_methods11 {

    public static void main(String[] args) {

        /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren

        String str = scan.nextLine();
        System.out.println(str.equalsIgnoreCase("Apple")? "String'in Apple'a eşittir.":"String'in Apple'a eşit değildir");










    }
}

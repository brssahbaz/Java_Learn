package Odevler.StringManipulationTasks;

import java.util.Scanner;

public class _13_String_methods10 {

    public static void main(String[] args) {

        /*  orange kelimesinden oluşan bir String oluşturun.
            String'in Apple'a eşit olup olmadığını doğrulayın. */

        //Kodu aşağıya yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren

        String str = scan.nextLine();
        System.out.println(str.equals("Apple")? "String'in Apple'a eşittir.":"String'in Apple'a eşit değildir");













    }
}

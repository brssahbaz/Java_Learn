package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci kelimeyi giriniz : ");
        String word1=sc.nextLine();
        System.out.println("İkinci kelimeyi giriniz : ");
        String word2=sc.nextLine();

       if (word1.equals(word2)) {
           System.out.println("String 1 is equal to String 2");}
       else System.out.println("String 1 is NOT equal to String 2");

       // OUTPUT: Birinci kelimeyi giriniz :
        //ali
        //İkinci kelimeyi giriniz :
        //alk
        //String 1 is NOT equal to String 2

        // Birinci kelimeyi giriniz :
        //Brsh
        //İkinci kelimeyi giriniz :
        //Brsh
        //String 1 is equal to String 2









        /* String compare=int1>int2 ?"int 1 is greater than 2" :"int 2 is greater than 1";

        System.out.println(compare);


         */

    }
}

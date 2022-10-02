package Odevler.Odev_15_Eyl;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir Banka Hesabınız Var mı?\nVarsa \"E\" yoksa \"H\" yazınız.");
        char cvp=sc.nextLine().charAt(0);
        boolean bnk;
        System.out.println(bnk=(cvp== 'e' ||cvp== 'E'));


// OUTPUT: Bir Banka Hesabınız Var mı?
//Varsa "E" yoksa "H" yazınız.
//E
//true
    }
}

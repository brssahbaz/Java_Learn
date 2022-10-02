package Odevler.ODEV_15_EYL_2;

import java.util.Scanner;

public class ODEV_2 {

    public static void main(String[] args) {

        /* task->
               * Kullanicidan bir character girmesini isteyin ve
                * girilen karakteri ve ascii degerini yazin
                *
 * Ornek : Input  : a
                *         Output : Girdiginiz 'a' karakterinin ascii degeri : 95
                */
        Scanner sc = new Scanner(System.in);//1 adım
        System.out.println("ascii değeri istediğin karakteri gir : ");//2 adım
        char ch=sc.nextLine().charAt(0);


        int chasciiDegeri=ch;
        System.out.println(ch+"'ın chasciiDegeri = " + chasciiDegeri);//$'ın chasciiDegeri = 36



    }




}

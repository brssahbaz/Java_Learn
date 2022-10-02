package Odevler.comparisonTasks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci tam sayıyı giriniz: ");
        int say1=sc.nextInt();
        System.out.println("İkinci tam sayıyı giriniz: ");
        int say2=sc.nextInt();

        System.out.println(((say1==say2)));

        // OUTPUT:Birinci tam sayıyı giriniz:
         //20
        //İkinci tam sayıyı giriniz:
         //20
         //true
        //Birinci tam sayıyı giriniz:
        //3
        //İkinci tam sayıyı giriniz:
        //4
        //false



    }
}

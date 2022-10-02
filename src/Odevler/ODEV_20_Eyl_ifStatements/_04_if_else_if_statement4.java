package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _04_if_else_if_statement4 {

    public static void main(String[] args) {

     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */


        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        double num1 = sc.nextDouble();
        System.out.println("İkinci sayıyı giriniz : ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("double 1 is greater than double 2");
        } else if (num1 < num2) System.out.println("double 1 is smaller than double 2");
        else System.out.println("double 1 is equal to double 2");
    // OUTPUT: 12,3
    //İkinci sayıyı giriniz :
    //12,4
    //double 1 is smaller than double 2
        //Birinci sayıyı giriniz :
        //25,6
        //İkinci sayıyı giriniz :
        //12,3456
        //double 1 is greater than double 2
    }
}

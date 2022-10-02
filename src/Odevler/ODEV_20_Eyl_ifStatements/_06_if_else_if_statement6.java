package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */


        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayıyı giriniz : ");
        int num1=sc.nextInt();
        if (num1 ==0) {
            System.out.println("Im neutral");
        } else if (num1 > 0) System.out.println("I m positive");
        else System.out.println("I am negative");
        // OUTPUT: Bir sayıyı giriniz :
        //12
        //I m positive
        //Bir sayıyı giriniz :
        //-7
        //I am negative
        // Bir sayıyı giriniz :
        //0
        //Im neutral






    }
}

package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _10_if_else_if_statement_with_logic_operators2 {

    public static void main(String[] args) {

/* 60 değerinde bir int oluşturun.
Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = scan.nextInt();
                if ((number % 9 == 0)&&number %5==0) {
            System.out.println("ble to divide by 9 and 5");
        }
        else if ((number % 4 == 0)&& number %5==0) {
            System.out.println("Able to divide by 4 and 15");
        }

        // OUTPUT:Bir sayı giriniz :
        //60
        //Able to divide by 4 and 15








    }
}

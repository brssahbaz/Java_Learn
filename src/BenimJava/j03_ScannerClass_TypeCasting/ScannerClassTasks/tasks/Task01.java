package BenimJava.j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner not=new Scanner(System.in);
        System.out.println("Mid term Notunuzu Giriniz: ");
        short mid=not.nextShort();
        System.out.println("Final  Notunuzu Giriniz: ");
        short fin=not.nextShort();
        System.out.println("Proje Notunuzu Giriniz: ");
        short prj=not.nextShort();
        System.out.println("Not Ortalamanız: "+((0.3*mid)+(0.5*fin)+(0.2*prj)));



    }
}

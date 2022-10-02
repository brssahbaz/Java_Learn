package HalukJava.j10_StringManipulations.Tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

/* Task05 Giirlen Stringin son karakterini silen kod yazınız

 */




       Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen metin giriniz : ");
        String ad=sc.nextLine();
   String yeniad=ad.substring(0,ad.length()-1);
        System.out.println(yeniad);   // 		str.replace(str.charAt(str.length()-1), "");















    }
}

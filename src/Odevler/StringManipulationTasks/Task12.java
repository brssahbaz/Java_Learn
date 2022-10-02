package Odevler.StringManipulationTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Üç kelimden oluşan adınızı arada boşluk olacak şekilde giriniz : ");
        String nameSurname = sc.nextLine().toUpperCase().trim();


        if (nameSurname.indexOf(" ") !=nameSurname.lastIndexOf(" ")) {

            String basharfler=nameSurname.charAt(0)+"."+nameSurname.charAt(nameSurname.indexOf(' ')+1)+"."+nameSurname.charAt(nameSurname.lastIndexOf(' ')+1)+".";
            System.out.println(basharfler);




        }

























    }
}

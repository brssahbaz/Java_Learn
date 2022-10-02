package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_LastİndexOf {
    public static void main(String[] args) {
/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/

      /*  String str="Good";

         System.out.println(str.indexOf('o')); // ilk o nun yerini integer olarak verir.
        System.out.println(str.toLowerCase().indexOf("g")); // ilk o nun yerini integer olarak verir.
        System.out.println(str.indexOf("g")); // ilk o nun yerini integer olarak verir.
        System.out.println(str.indexOf("od")); // od un başladığı yeri verir. 2
        System.out.println(str.indexOf("D")); // yoksa -1 verir. -1

         */

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */


        String str="Mustafa nizamoğlu fa";
        System.out.println(str.lastIndexOf('a')); // sondan sayar 11 verir
        System.out.println(str.indexOf('a')); // baştan saydı 4
        System.out.println(str.lastIndexOf("fa")); // sondan saydı 18

        //task
        // Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz
        //
        // 1-Girilen cumle java icermiyor
        // 2-Girilen cumle 1 tane java iceriyor
        // 3-Girilen cumlede birden fazla java var
        // */



        Scanner sc=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String cumle=sc.nextLine().toLowerCase();
        if (!cumle.contains("java")) {   // (cumle.indexof("java"==-1)
            System.out.println("Girdiğiniz cümle java içermiyor.");

        } else if (cumle.indexOf("java")==cumle.lastIndexOf("java")) {
            System.out.println("Bir tane Java içeriyor");

        } else System.out.println("Birden fazla java içerir");








    }

}

package Odevler.ODEV_24_EYL_StringManipulation;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ifade Giriniz.");
        String cumle = sc.nextLine().toLowerCase();
        String sub1 =cumle.substring(0,cumle.length()/2);
       System.out.println((sub1.length()%2==0)?sub1:"Karakter sayısı çift olan bir ifade giriniz");
        // OUTPUT: Bir ifade Giriniz.
        //asdf
        //as
        //Bir ifade Giriniz.
        //asd
        //Karakter sayısı çift olan bir ifade giriniz







    }
}

package HalukJava.j10_StringManipulations.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

/* girilen 2 kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden, ilk kelime tek sayıda karakter içerirse kelime 2, kelime 1 e klenmez

 */


        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen birinci kelimeyi giriniz : ");
        String word1=sc.nextLine();
        System.out.println("Lütfen ikinci kelimeyi giriniz : ");
        String word2=sc.nextLine();

        if (word1.length() % 2 == 0) {
            System.out.println(word1.substring(0,word1.length()/2)+word2+(word1.substring(word1.length()/2)));



        }else System.out.println(" içermez");






    }
}

package HalukJava.j10_StringManipulations.Tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

/* Task05 Giirlen Stringin içindeki istenen indeksdeki karakteri print silen kod yazınız

 */




       Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen metin giriniz : ");
        String ad=sc.nextLine();
        System.out.println("Hangi indeksi istiyorsunuz: ");
        int  index=sc.nextInt();
        if (index<ad.length()){
        System.out.println(ad.charAt(index));  // 2. yol ad.substring(index,index)

             } else System.out.println("Hatalı indeks girdiniz.");
















    }
}

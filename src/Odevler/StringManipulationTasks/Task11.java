package Odevler.StringManipulationTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner sc = new Scanner(System.in);

        System.out.println("Ad ve soyadınız arada boşluk olacak şekilde giriniz : ");
        String name = sc.next().trim();
        String surName = sc.next().trim();
        System.out.println("Ad:"+name +"\nSoyad:" + surName);














    }
}

package Odevler.StringManipulationTasks;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

        String str = "Al am an ya";

       // str.indexOf('a')-> ilk a'nın index'ini verir
       // System.out.println(str.indexOf('a', str.indexOf('a') + 1));

        System.out.println((str.indexOf(' ', str.indexOf(' ', str.indexOf(' ') + 1)) ));
            System.out.println("2 boşluk");


    }
}
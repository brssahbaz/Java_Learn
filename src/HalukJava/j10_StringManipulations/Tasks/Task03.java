package HalukJava.j10_StringManipulations.Tasks;

public class Task03 {

    public static void main(String[] args) {

// Alamanya strindeki ikinci a karakterinin indeksini bul

String word="Alamanya";
      /*  System.out.println(word.indexOf('a', 1));
        System.out.println(word.indexOf('m', 2)+1);

       */
                                                // ilk küçük a dan sonraki a yı bulacak
        System.out.println(word.indexOf('a', word.indexOf('a') + 1));


    }
}

package HalukJava.j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
        /** concat() methodu içine aldığı string variable ı çalıştığı stringin sonuna ekler.
         * java da + işlemi ile de stringler birleştirebilir
         *TRICK: String methodları variable gecici bir değişiklik yapar.ama atama yapılırsa değişiklik kalıcı olur.
         *
         *
          */

String name="Nur";
String meslek=" QA Tester ";
        System.out.println(name.concat(meslek));
        System.out.println(name);
name=meslek.concat(name);
        System.out.println(name);

        System.out.println(name.concat(true + ":) "));//  QA Tester Nurtrue:)
        System.out.println(name.concat(100 + ":) "));//  QA Tester Nur100:) concat methodu parametre oalrak string type harici tüm dataları stringe çevirir

    }
}

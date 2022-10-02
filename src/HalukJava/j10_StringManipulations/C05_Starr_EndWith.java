package HalukJava.j10_StringManipulations;

public class C05_Starr_EndWith {
    public static void main(String[] args) {
// /**
// * startsWith()
// *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
// *  String'in basladigi characteri dogrular
// * endsWith()
// * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
// */


        String sehir = "Istanbul";
        System.out.println(sehir.startsWith("I")); // true
        System.out.println(sehir.startsWith("Is"));// true
        System.out.println(sehir.startsWith("s"));// false
        System.out.println(sehir.startsWith("i", 3));// false
        System.out.println(sehir.startsWith("a", 3));// true  kelimenin 3. indeksi a ile mi başlar?
        System.out.println(sehir.startsWith("u", 6));// true


        System.out.println(sehir.endsWith("l")); // true
        System.out.println(sehir.endsWith("k")); // false
        System.out.println(sehir.endsWith("bul")); // true


        String str = "bul";
        System.out.println(sehir.endsWith(str));// true
        int yas = 48;
        //  System.out.println(sehir.endsWith(yas));// CTE hatası . string olmalı ama int girdik


        // TASK: Giirlen e-mail hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile biriyorsa "hesabınız onaylandı" aksi durumda geçerli hesap giriniz print eden code create ediniz.


    }
}

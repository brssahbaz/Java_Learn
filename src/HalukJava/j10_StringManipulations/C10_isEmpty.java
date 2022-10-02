package HalukJava.j10_StringManipulations;

public class C10_isEmpty {
    public static void main(String[] args) {

      /* string tamamne boş mu değil mi kontrol eder. sonuç true false.length=0 olur

       */ //(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler


        String str="hi";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.replaceAll("\\w", "").isEmpty()); // method chain













    }
}

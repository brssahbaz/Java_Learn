package HalukJava.j10_StringManipulations;public class C02_Length
{
    public static void main(String[] args) {



    /**length() methodu girilen stringin uuznluğunu( içinde kaç karakter olduğunu return eder)
     *
     */

String str="madem geldin";
int strKrktrSayisi=str.length();
        System.out.println(str);
        String str2=" ";
        String str1="";
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str2);
        String str3=null;
        System.out.println(str3.length());// Cte hatası verirr. null case sensitive dir. Null veya NULL yazılamaz.
        // sadece hiçliği gösteren bir pointer işaretçidir.
        // TRICK:null atanan stringler string method çalışmaz.
        System.out.println(str3.length()); // hata verir
        String name; // deklare edilmiş ama atanmamış string
       // name.concat(str1);
        // sc.nextline(); yazınca giriş almadan devam eder.




    }

}

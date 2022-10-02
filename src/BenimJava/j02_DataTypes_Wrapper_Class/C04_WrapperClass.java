package BenimJava.j02_DataTypes_Wrapper_Class;

import java.util.Scanner;

public class C04_WrapperClass {
    public static void main(String[] args) {

   String name="Barish";
   int yas=46;

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
// ancak primitive data turlerinin boyle bir ozelligi yoktur
// primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
//Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
// olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
// ara çözüm imkanı sunmuştur.


String tc="1234555";
String id="98765";
// Task: id ve tc string değerlerinin toplamını print eden kod
int yenitc=Integer.valueOf(tc); // tc String değerini int e çevirdi

        System.out.println("yenitc = " + yenitc);
        int yeniid=Integer.valueOf(id); // tc String değerini int e çevirdi
        System.out.println("yeniid = " + yeniid);
        System.out.println(yeniid+yenitc);
        String okulNo="923453l";
        //int yeniOkulNo= Integer.valueOf(okulNo); // run time exception çalışma zamanı istisnası
       //  System.out.println("yeniOkulNo = " + yeniOkulNo);

// tASK: byte short int MAX ve min değerlerini print eden kod yazınız.
        byte maxByteDegeri=Byte.MAX_VALUE;
        byte minByteDegeri=Byte.MIN_VALUE;
        System.out.println(maxByteDegeri);
        System.out.println(minByteDegeri);
        int maxIntegerDegeri=Integer.MAX_VALUE;
        int minIntegerDegeri=Integer.MIN_VALUE;
        System.out.println("maxIntegerDegeri = " + maxIntegerDegeri);
        System.out.println("minIntegerDegeri = " + minIntegerDegeri);
        short maxShortDegeri=Short.MAX_VALUE;
        short minShortDegeri=Short.MIN_VALUE;
        System.out.println("maxShortDegeri = " + maxShortDegeri);
        System.out.println("minShortDegeri = " + maxShortDegeri);


        Scanner sc=new Scanner(System.in);
        System.out.println("İsminizi Giriniz: ");
        char ch= sc.nextLine().charAt(0) ;// girilen string in sıfırıncı ilk karakterini alır






    }
}

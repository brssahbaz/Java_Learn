package BenimJava.j04_AritmeticOperators;

public class Odevler_15_eyl {
    public static void main(String[] args) {

        int k = 5;
       int  a=++k;
        int  b=k++;
        int  c=k++;
        int  d=--k;
        int  e=k--;
        int  f=k;

        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" ");
        System.out.println("sonuc = " + sonuc);








    }
}

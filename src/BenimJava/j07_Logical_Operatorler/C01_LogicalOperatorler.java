package BenimJava.j07_Logical_Operatorler;

public class C01_LogicalOperatorler {
    public static void main(String[] args) {

boolean b1=true;
int a=3;
int c=7;
        System.out.println(b1&(a<c));
        System.out.println(b1&&(a>c));
        System.out.println(b1&(a==c));



        System.out.println(b1||(a<c));
        System.out.println(b1||(a>c));
        System.out.println(b1||(a==c));

        System.out.println(!(b1||(a<c)));
        System.out.println(!(b1||(a>c)));
        System.out.println(!(b1||(a==c)));




    }





}

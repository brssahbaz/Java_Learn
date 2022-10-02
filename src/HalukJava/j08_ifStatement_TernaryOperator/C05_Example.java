package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_Example {

    public static void main(String[] args) {
    /*
    TASK-->Girilen 2 sayıyı seçilen 4 işlemden birine uygulayıp sonucu print eden code creat ediniz

    */
        Scanner    sc=new Scanner(System.in)    ;
        
        System.out.println("Birinci sayıyı giriniz: ");
        
        double say1=sc.nextDouble();

        System.out.println("İkinci sayıyı giriniz: ");

        double say2=sc.nextDouble();

      //  System.out.println("+ için --> + \n - için -->2 \n * için --> 3\n / için --> 4 seçiniz.");
     //  int secim=sc.nextInt();
        char secim=sc.next().charAt(0);
       if (secim=='+'){
           System.out.println("Toplama sonucu: "+say1+" + "+say2+"= "+(say1+say2));

       }
        else if (secim==2){
            System.out.println("Toplama sonucu: "+say1+" - "+say2+"= "+(say1-say2));

        }
        else if (secim==3){
            System.out.println("Toplama sonucu: "+say1+" *"+say2+"= "+(say1*say2));

        }
        else if (secim==4) {
            System.out.println("Toplama sonucu: " + say1 + " / " + say2 + "= " + (say1 / say2));
        }
        else System.out.println("Doğru bir işlem gir");





























    }

}

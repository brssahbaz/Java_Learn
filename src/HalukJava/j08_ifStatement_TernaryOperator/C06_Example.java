package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C06_Example {

    public static void main(String[] args) {
    /*
    TASK-->Kullanıcnın cinsiyeti kadın ise 60 yaşından büyük ve prim günü 6000 den büyükse emekliliğini
            Kullanıcnın cinsiyeti kadın ise 65 yaşından büyük ve prim günü 7000 den büyükse emekliliğini kontrol edip kalan yıl ve prim gününü print eden code reate ediniz
    */
        Scanner    sc=new Scanner(System.in)    ;

        System.out.println("Cinsiyetiniz\n KADIN için:--> K\n ERKEK için -->E\n giriniz.)");
        char cnsyt=sc.next().charAt(0);

        if (cnsyt=='K') {
            System.out.println("Yaşınızı giriniz: ");
            int yas=sc.nextInt();
            if (yas>=60) {
                System.out.println("Prim gününüzü giriniz.)");
                int prim=sc.nextInt();
                if (prim>6000) {
                    System.out.println("Emekli olabilirsiniz.");
                }else System.out.println("Emekliliğiniz için: "+(6000-prim)+" prim günü yatırmalısınız.");

            } else System.out.println("Emekliliğinize: "+(60-yas)+" yıl daha var.");

        }else if (cnsyt=='E'){
            System.out.println("Yaşınızı giriniz: ");
            int yas=sc.nextInt();
            if (yas>=65) {
                System.out.println("Prim gününüzü giriniz.)");
                int prim=sc.nextInt();
                if (prim>7000) {
                    System.out.println("Emekli olabilirsiniz.");
                }else System.out.println("Emekliliğiniz için: "+(7000-prim)+" prim günü yatırmalısınız.");

            } else System.out.println("Emekliliğinize: "+(70-yas)+" yıl daha var.");


    }

         else System.out.println("Cinsiyetinizi doğru giriniz.");





























    }

}

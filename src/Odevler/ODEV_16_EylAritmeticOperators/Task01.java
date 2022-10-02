package Odevler.ODEV_16_EylAritmeticOperators;

public class Task01 {
	public static void main(String[] args) {
		 int x = 4;
            System.out.println("x = " + x);
            x++;
            System.out.println(x);
            x += x;
            System.out.println(x);

        --x;
            System.out.println(x);
            x = 7 + x;
            System.out.println(x);
            x *= x;
            System.out.println(x);
            x -= 3;
            System.out.println(x);
            System.out.println(" x = " + x );
        
        int a = 3;
        double d = 4.5;

        d+=a;
            System.out.println("d= "+d);
            a+=d;
            System.out.println("a= "+a);
            d-=a;
            System.out.println("d= "+d);
                    a-=d;
            System.out.println("a= "+a);

            System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );




        

	}

}

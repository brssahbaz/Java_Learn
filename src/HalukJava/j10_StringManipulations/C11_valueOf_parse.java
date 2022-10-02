package HalukJava.j10_StringManipulations;

public class C11_valueOf_parse {
    public static void main(String[] args) {

      // Integer.valueof() rakamlarla  oluşturulan Stringleri sayıya dönüştürür.rakamlarla oluşturulan Stringlerler matematiksel işlem yapmayı sağlar

        // TASK: String type verilen 2 adet bağışı toplasın
      String str1=" qs1500";
      String str2="2500";
        System.out.println();
    int bagis1=Integer.valueOf(str1.replaceAll("\\D",""));
      int bagis2=Integer.valueOf(str2);


        System.out.println(bagis1+bagis2);
        int fetih=Integer.valueOf("1453");
        System.out.println(fetih); // 1453 integeri verir

        System.out.println(Integer.parseInt(str2) + Integer.parseInt(str2));

        int tc=1234567;
        String strTc=String.valueOf(tc);
        System.out.println(strTc);
        System.out.println(strTc+tc);

      String fiyat="$150";
      int yenifiyat=Integer.valueOf(fiyat.replaceAll("\\D",""));
        System.out.println(yenifiyat);


    }
}

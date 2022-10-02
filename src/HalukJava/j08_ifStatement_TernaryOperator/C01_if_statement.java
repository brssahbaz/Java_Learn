package HalukJava.j08_ifStatement_TernaryOperator;

public class C01_if_statement {
    public static void main(String[] args) {
        int krmYas = 33;
        int ismlYas = 40;
        if (krmYas == ismlYas) {
            System.out.println("Aynı yaştasınız.");
        }
        else if (krmYas >= 40) {
            System.out.println("krm bey olgunsunuz.");
            System.out.println("bu satırı okuduysanız 11. satırdaki if den bağımsız");
        }
        if (krmYas + ismlYas > 100) {
            System.out.println("yaşları toplamınız 100 den büyük");
        }

        System.out.println("slm");

// ctrl + alt+ L
    }
}

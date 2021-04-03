import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // harf notuna göre öğrencinin geçtiğini ya da kaldığını gösteren kod *switch kullanımına örnek

        System.out.println("Harf notunu giriniz:");
        char grade;
        grade=(char)System.in.read();

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok Güzel: Geçtiniz.");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz.");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz.");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");

        }
    }
}

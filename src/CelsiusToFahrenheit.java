import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        /*
            Örnek Menü Tasarımı:

            Sıcaklık Dönüşüm Uygulaması
            1. Santigrat - Fahrenheit
            2. Fahrenheit - Santigrat
            Seçim :
            -------------------------
            Formül: F=Cx1.8+32
                    C=(F-32)/1.8
             -----------------------
            Örnek;  F=30x1.8+32=86
                    C=(86-32)/1.8=30
            -------------------------
             Ekran Çıktısı:
             30 C --> 86 F
             86 F --> 30 C
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Dönüşüm Uygulaması ");
        System.out.println("------------------------------");
        System.out.println("1. Fahrenheit --> Santigrat ");
        System.out.println("2. Santigrat --> Fahrenheit ");
        System.out.println("------------------------------");
        System.out.print("Seciminiz: ");
        int choice = input.nextInt();

        double fa;
        double sa;

        if (choice == 1) {
            System.out.print("Kaç Fahrenayt: ");
            fa = input.nextInt();
            sa = (fa-32) / 1.8;
            System.out.println(fa + " F" + "--> " + sa + " C " );

        }else if (choice == 2) {
            System.out.print("Kaç Derece: ");
            sa = input.nextInt();
            fa = (sa*1.8) + 32;
            System.out.println(sa + " C" + "--> " + fa + " F ");

        }else {
            System.out.println("Düzgün seçim yap.");
        }




    }
}

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

           /* Örnek Menü Tasarımı:

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
        System.out.println("============================");
        System.out.println("SICAKLIK DÖNUŞÜM TABLOSU");
        System.out.println("============================");
        System.out.println("1. Santigrat - Fahrenheit");
        System.out.println("2. Fahrenheit - Santigrat");

        System.out.print("Seçim =");
        int sec = input.nextInt();
        if(sec!=1&sec!=2) {
            System.out.println("Yanlış seçim yaptınız.");
            return;
        }
        System.out.print("Sıcaklık Değerini Giriniz=");
        int deger = input.nextInt();

        switch (sec) {
            case 1: {
                double fahrenat = (int) (deger * 1.8 + 32);
                System.out.println(deger + " C --> " + fahrenat + " F dir.");
            }


            case 2: {
                double santigrat = (int) ((deger - 32) / 1.8);
                System.out.println(deger + " F-->" + santigrat + " C dir.");
            }


            default: {
                System.out.println("Yanlış seçim yaptınız.");

            }
        }
    }
}
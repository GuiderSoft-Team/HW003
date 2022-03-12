import java.util.Scanner;


public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deger, check = 0;
        double santigrad, fahrenheit;
        System.out.println("sicaklik degerini tamsayi olarak gir:");
        deger = input.nextInt();

        System.out.println("santigrad a cevirmek icin 1, fahrenheit a cevirmek icin 2 yi gir");
        check=input.nextInt();

        if (check == 1) {
            santigrad = (deger * 1.8) + 32;
            System.out.println("girdiginiz degerin fahrenheit karsiligi: " + santigrad);
        }else {
            fahrenheit = (deger - 32) / 1.8;
            System.out.println("girdiginiz degerin fahrenheit karsiligi: " + fahrenheit);

        }


        //TODO: Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.
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


    }
}

import java.util.Scanner;

public class CelsiusToFahrenheit3 {
    public static void main(String[] args) {
        // Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.
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
        Scanner sc=new Scanner(System.in);
        char secim;
        System.out.println("Isı Dönüşümleri\n\tSantigrat to Fagranhat için (F) tuşlayınız." +
                "\n\tFahrenhayt to Santigrat için (C) tuşlayınız.");
        System.out.println("Seçiminizi Yapınız: ");
        secim=sc.next().trim().toUpperCase().charAt(0);
        double derece, F, C=0;
        System.out.println(" Bir değer C değeri giriniz: ");
        derece=sc.nextDouble();


        switch (secim){

            case 'F':
                F=derece*1.8+32;
                System.out.println(derece+" C  --> "+ F+ " F");
                break;
            case 'C':
                C=(derece-32)/1.8;
                System.out.println(derece+" F --> " + C+ " C");
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz");
        }

    }
}

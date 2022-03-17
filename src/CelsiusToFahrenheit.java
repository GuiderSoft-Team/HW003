import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
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

        Scanner input = new Scanner(System.in);
        System.out.println("SICAKLIK DÖNÜŞÜM UYGULAMASI");
        System.out.println("---------------------------");
        System.out.println("1. Santigrat - Fahrenheit");
        System.out.println("2. Fahrenheit - Santigrat");
        System.out.print("Seçim: 1-2:");
        int secim = input.nextInt();

        System.out.print("Sıcaklığı giriniz:");
        int sicaklik=input.nextInt();

        switch(secim){
            case 1->{double fahrenheit=sicaklik*1.8+32;
                System.out.println(sicaklik+"C-->+fahrenheit"+"F");
        }
            case 2->{double santigrat=(sicaklik-32)/1.8;
                System.out.println(sicaklik+"F-->"+"C");
            }
            default -> System.out.println("Yanlış Seçim Yaptınız");
        }
    }
}
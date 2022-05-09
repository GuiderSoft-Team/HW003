import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.

        System.out.println("Sıcaklık Dönüüm Uygulaması ");
        System.out.println("SEÇİM");
        System.out.println("Santigrat => Fahrenheit = 1");
        System.out.println("Fahrenheit => Santigrat = 2");
        System.out.print("Seçim :");
        Scanner input=new Scanner(System.in);
        int seçim = input.nextInt();
        if (seçim ==1)
        {
            System.out.print("Santigrat Değeri :");
            double santigratDerece = input.nextInt();
            double formül = (santigratDerece*1.8)+32;
            System.out.println("Fahrenheit değeri ="+formül);

        }
        if (seçim ==2)
        {
            System.out.print("Fahrenheit Değeri :");
            double Fahrenheit = input.nextInt();
            double formül = (Fahrenheit-32)/1.8;
            System.out.println("Santigrat değeri ="+formül);

        }

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

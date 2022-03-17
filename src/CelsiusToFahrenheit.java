
import java.util.Scanner;
public class CelsiusToFahrenheit {
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
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Dönüşüm Uygulaması");
        System.out.println("1. Celcius - Fahrenheit");
        System.out.println("2. Fahrenheit - Celcius");
        System.out.println("seç : ");


        int sec =  input.nextInt();

        double c,f;
        System.out.print("Sıcaklığı giriniz :");
        double Temperature = input.nextDouble();

        switch (sec) {
            case 1:
                f = Temperature*1.8+32;
                System.out.println(Temperature +"C"+" -------> "+f+" F");
                break;
            case 2 :
                c = (Temperature-32)/1.8;
                System.out.println(Temperature+ "F"+" -------> "+c+" C");
            default :
                System.out.println("Yanlış bir değer ");
                break;
        }
    }
}

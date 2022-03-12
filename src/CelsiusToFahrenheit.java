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
        Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklık Dönüşüm Uygulaması");
        System.out.println("1.Santigrat - Fahrenheit");
        System.out.println("2.Fanrenheit - Santigrat");
        System.out.print("Seçim = ");
        int secim=input.nextInt();

        double c,f;
        System.out.print("Sıcaklık değerini giriniz : ");
        double deger= input.nextDouble();

        switch (secim){
            case 1:
                f=deger*1.8+32;
                System.out.println(deger+" C"+"-->"+f+" F");break;
            case 2:
                c=(deger-32)/1.8;
                System.out.println(deger+ " F"+"-->"+c+" C");break;
            default:
                System.out.println("Yanlış değer girdiniz.");break;
        }



    }
}

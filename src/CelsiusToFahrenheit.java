import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.
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
            System.out.print("Lutfen cevirmek istediginiz degeri yaziniz:");
         int sayi= input.nextInt();
            System.out.println("1. Santigrata Cevir");
            System.out.println("2. Fahrenheit Cevir");
            System.out.print("Cevir: ");
        int secim= input.nextInt( );

        switch (secim){
            case 1:
                int santigrat = (int) ((sayi-32)/1.8);
                        System.out.println(sayi+" F --> "+santigrat+" C");
break;
            case 2:
                int fahrenheit= (int) ((sayi*1.8)+32);
                        System.out.println(sayi+" C --> "+ fahrenheit+" F");
                break;

            default:
                System.out.println("Yanlis girdi");



        }




    }
}

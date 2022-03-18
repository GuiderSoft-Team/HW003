import java.sql.SQLOutput;
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
        System.out.println("*\t*\tSıcaklık Dönüşüm\t*\t*");
        System.out.println("Lütfen dönüşüm yapmak istediğiniz sıcaklık birimlerini seçiniz.");
        System.out.println("1. Santigrat - Fahrenheit");
        System.out.println("2. Fahrenheit - Santigrat");
        Scanner input1=new Scanner(System.in);
        System.out.print("Seçim : ");
        double secim= input1.nextDouble();
        Scanner input2=new Scanner(System.in);
        System.out.print("Sıcaklık Değeri: ");
        double sicaklik= input2.nextDouble();
        if(secim==1){
            double F=(sicaklik*1.8)+32;
            System.out.println(sicaklik+"C Derece -->"+F+" Fahrenheit");
        }else if(secim==2){
            double C=(sicaklik-32)/1.8;
            System.out.println(sicaklik+" Fahrenheit -->"+C+" C derece");
        }else{
            System.err.println("Hatalı parametre girişi!");
        }
    }
}

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        System.out.print("""
                Sıcaklık Dönüştürücü
                1.Santigrad - Fahrenheit
                2.Fahrenheit - Santigrad
                """);
        Scanner input=new Scanner(System.in);
        System.out.print("Dönüştürücü seçiniz[1-2]: ");
        int secim=input.nextInt();
        int sicaklik;
        switch (secim) {
            case 1:
                System.out.print("Sıcaklık değerini giriniz[°C]: ");
                sicaklik=input.nextInt();
                double sicaklikF=(sicaklik*18/10)+32;
                System.out.println(sicaklik+"°C"+" --> "+sicaklikF+"°F");
                break;
            case 2:
                System.out.print("Sıcaklık değerini giriniz[°F]: ");
                sicaklik=input.nextInt();
                double sicaklikC=(sicaklik-32)/(1.8);
                /* System.out.println(sicaklik+"°F"+" --> "+sicaklikC+"°C");*/
                System.out.print(sicaklik+"°F"+" --> ");System.out.print(Math.round(sicaklikC));System.out.print("°C");
                break;
        }
    }
}

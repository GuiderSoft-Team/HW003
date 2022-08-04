import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("sicaklik degeri giriniz= ");
        int sıcaklıkDegeri = input.nextInt();

        System.out.println("sicaklik degisim uygulamasi");

        System.out.println("--");
        System.out.println("1. c derece Hesapla");
        System.out.println("2. f derece Hesapla");
        System.out.print("Seciminiz: ");
        int secim = input.nextInt();
        System.out.println();
        switch (secim) {
            case 1:
                double C = (sıcaklıkDegeri - 32) / 1.8;
                System.out.println(C + " " + "C" + "--->" + sıcaklıkDegeri + " " + 'F');
                break;
            case 2:

                Double F = sıcaklıkDegeri * 1.8 + 32;
                System.out.println(F + " " + "F" + "---->" + sıcaklıkDegeri + " " + 'C');

                break;
        }
    }
}
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Sıcaklık Dönüşüm Uygulaması

        Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklık Dönüşüm Uygulaması ");
        System.out.println("1. Santigrat - Fahrenheit");
        System.out.println("2. Fahrenheit - Santigrat");
        System.out.println("--------------------------");
        System.out.print("Yapmak istediğiniz Dönüşümü Seçiniz:");
        int secim=input.nextInt();
        switch (secim){

            case 1:
                System.out.print("Lütfen Hava Sıcaklığını Santigrat olarak Girininiz: ");
               int c=input.nextInt();
               int f= (int) (c*1.8+32);
                System.out.println(c+" C---->"+f+" F");
                break;
            case 2:
                System.out.print("Lütfen Hava Sıcaklığını Fahrenheit olarak Girininiz: ");
                f = input.nextInt();
                c = (int) ((f - 32) / 1.8);
                System.out.println(f+" F---->"+c+" C");
                break;
            default:
                System.out.println("Yanlış Seçim !!!");
        }




    }
}

import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vize, ffinal;
        double ortalama;
        System.out.println("vize sinav sonucunu gir: ");
        vize = input.nextInt();

        System.out.println("final sinav notunu gir");
        ffinal = input.nextInt();

        ortalama = vize * 0.4 + ffinal * 0.6;

        if (ortalama >= 90 || ortalama <= 100) {
            System.out.println(ortalama + "[A]");

        } else if (ortalama >= 80 || ortalama <= 89) {
            System.out.println(ortalama + "[B]");

        } else if (ortalama >= 70 || ortalama <= 79) {
            System.out.println(ortalama + "[C]");

        } else if (ortalama >= 60 || ortalama <= 69) {
            System.out.println(ortalama + "[D]");

        } else {
            System.out.println(ortalama + "[F]");
        }

        //TODO: Klavyeden girilen vize ve final notlarının ortalamasını ve harf notunu bulan bir program yazınız.
        /*
            Vize Notu :
            Final Notu :

            Formül: not=Vize Notu x 0.4 + Final Notu x 0.6
            Harfler:
                A 90-100
                B 80-89
                C 70-79
                D 60-69
                F 0-59

            Örnek Ekran Çıktısı:

            Not : 80 [B]

         */

    }
}

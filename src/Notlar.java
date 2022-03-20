import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen vize ve final notlarının ortalamasını ve harf notunu bulan bir program yazınız.
        Scanner input = new Scanner(System.in);
        System.out.print("vize notu");
        int vizeNotu = input.nextInt();
        System.out.print("Final Notu");
        int finaNotu = input.nextInt();
        double ortalama = (vizeNotu * 0.4) + (double) (finaNotu * 0.6);
        System.out.println(ortalama);

        if (ortalama >= 90) {
            System.out.println("A MÜKEMMEL GEÇTİNİZ");
            return;
        }
        if (ortalama >= 80) {
            System.out.println("B ÇOK GÜZEL GEÇTİNİZ");
            return;
        }
        if (ortalama <=70)
        {
            System.out.println("C ÇOK GÜZEL GEÇTİNİZ");
            return;
        }
        if (ortalama <= 60) {
            System.out.println("D GEÇTİNİZ");
            return;
        } else {
            System.out.println("F Kaldınız");
        }
    }
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



import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {

        // Klavyeden girilen vize ve final notlarının ortalamasını ve harf notunu bulan bir program yazınız.
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
        Scanner input=new Scanner(System.in);
        System.out.println("vize notu: ");
        int vizeNotu= input.nextInt();
        System.out.println("final notu : ");
        int finalNotu= input.nextInt();

        double sonuç =vizeNotu*0.4+finalNotu*0.6;
        String geçti = sonuç < 60? "[F]": sonuç < 70? "[D]": sonuç <80? "[C]": sonuç <90? "[B]": sonuç<=100? "[A]" : "geçersiz";
        System.out.println("sonuç : " +sonuç+" "+geçti);
    }
}

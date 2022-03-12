import java.util.Scanner;

public class Notlar3 {
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
        Scanner sc=new Scanner(System.in);

        System.out.println("Vize nutunu giriniz: ");
        double vizeNotu=sc.nextDouble();

        System.out.println("Final Notunu Giriniz: ");
        double finalNotu= sc.nextDouble();

        double nOrt=vizeNotu * 0.4 + finalNotu * 0.6;

        String notHarf= nOrt<=60? "[F]" :nOrt<=70? "[D]": nOrt<=80? "[C]" :nOrt<=90? "[B]" :nOrt<100? "[A]": "[G]";

        System.out.println(nOrt+" " +notHarf);

    }
}

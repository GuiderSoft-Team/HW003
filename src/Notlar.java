import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
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

            Not : 80 [B]*/
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen vize notunu giriniz=");
        int vizeNotu = input.nextInt();
        System.out.print("lütfen final notunu giriniz=");
        int FinalNotu = input.nextInt();

        double not = (vizeNotu * 0.4) + (FinalNotu * 0.6);
        String NotHarf=not < 60 ? not + " [" + "F" + "]" : not < 70 ? not + " [" + "D" + "]" : not < 80 ? not + " [" + "C" + "]" : not < 90 ? not + " [" + "B" + "]" : not <= 100 ? not + " [" + "A" + "]" : "geçersiz bir not girildi";
        System.out.println("Not: "+NotHarf);


    }

}

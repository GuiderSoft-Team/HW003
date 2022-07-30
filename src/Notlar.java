import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        //Klavyeden girilen vize ve final notlarının ortalamasını ve harf notunu bulan bir program yazınız.
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

            Not : 80 [B]  */

        Scanner scan = new Scanner(System.in);

        System.out.print("Vize notunuzu giriniz: ");
        int vize = scan.nextInt();
        System.out.print("Final notunu giriniz: ");
        int fınal = scan.nextInt();

        int not = (int) ((vize * 0.4) + (fınal * 0.6));

        System.out.print("Not :" + not);

        if(not > 90) {
            System.out.print(" [A]");
        }
        else if(not > 80) {
            System.out.print(" [B]");
        }
        else if(not > 70) {
            System.out.print(" [C]");
        }
        else if(not > 60) {
            System.out.print(" [D]");
        }
        else {
            System.out.print(" [F]");
        }


    }
}





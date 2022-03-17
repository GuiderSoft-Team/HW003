import javax.security.sasl.SaslClient;
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

            Not : 80 [B]

         */

        Scanner input=new Scanner(System.in);

        System.out.println("Not");
        System.out.println("<---->");
        System.out.println();
         int notV;
         int notF;

        System.out.print("Vize Notunu Giriniz:");
             notV=input.nextInt();
        System.out.print("Final Notunu giriniz:");
             notF=input.nextInt();

        double ort= notV*0.4+notF*0.6;
        char notHarf=ort<60?'F':ort<70?'D':ort<80?'C':ort<90?'B':ort<=100?'A':'G';
        System.out.print("NOT:"+ort +"["+notHarf+"]");

    }
}

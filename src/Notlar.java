import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {

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

        Scanner input = new Scanner(System.in);
        System.out.print("Vize Notu: ");
        int vnot = input.nextInt();
        System.out.print("Final Notu: ");
        int fnot = input.nextInt();

        double ort = (vnot * 0.4) + (fnot * 0.6);
        char harf = ort<60?'F' :ort<70?'D' :ort<80?'C' :ort<90?'B' :ort<=100?'A' :'G';

        System.out.println("Not: " + ort + "(" +harf +")");






    }
}

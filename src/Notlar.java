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

            Not : 80 [B]
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Vize notunu giriniz: ");
        int vize=input.nextInt();
        System.out.print("Final notunu giriniz: ");
        int finalNOtu=input.nextInt();
        double ortalama=((vize*0.4)+(finalNOtu*0.6));
        char harf=ortalama<60?'F':ortalama<70?'D':ortalama<80?'C':ortalama<90?'B':ortalama<=100?'A':'G';
        System.out.println("Not : "+ortalama+" ["+harf+"]");




    }
}

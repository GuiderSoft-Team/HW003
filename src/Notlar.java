import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        // Klavyeden girilen vize ve final notlarının ortalamasını ve harf notunu bulan bir program yazınız.
        Scanner input=new Scanner(System.in);
        System.out.print("Vize Notu  = ");
        int vizeNotu=input.nextInt();
        System.out.print("Final Notu = ");
        int finalNotu=input.nextInt();
        if(vizeNotu<0|finalNotu<0){
            System.err.println("Girilen Not Eksi Olamaz");
            System.out.println("Lütfen Tekrar Giriniz");
            System.exit(-1);
        }

        double ortalama=(vizeNotu*0.4)+(finalNotu*0.6);
        String notOrtHarf= ortalama < 60 ? ortalama + " [" + "F" + "]" : ortalama < 70 ? ortalama + " [" + "D" + "]" : ortalama < 80 ? ortalama + " [" + "C" + "]" : ortalama < 90 ? ortalama + " [" + "B" + "]" : ortalama <= 100 ? ortalama + " [" + "A" + "]" : "geçersiz bir ortalama girildi";
        System.out.println("Öğrencinin Not Ortalaması: "+notOrtHarf);





            }
}


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
        System.out.println("Ortalama hesaplama programı : ");
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen vize notunuzu giriniz : ");
        double vize=input.nextDouble();
        System.out.println("Lütfen final notunuzu giriniz :");
        double fnl= input.nextDouble();
        double ortalama=average(vize,fnl);

        if (ortalama>=90&ortalama<=100){
            System.out.println("not = "+ortalama);
            System.out.println("harf notu A ");
        } else if (ortalama>=80&ortalama<90){
            System.out.println("not = "+ortalama);
            System.out.println("harf notu B ");
        } else if (ortalama>=70&ortalama<80){
            System.out.println("not = "+ortalama);
            System.out.println("harf notu C ");
        } else if (ortalama>=60&ortalama<70){
            System.out.println("not = "+ortalama);
            System.out.println("harf notu D ");
        } else {
            System.out.println("not = "+ortalama);
            System.out.println("harf notu F ");
        }



    }
    public static double average(double vize,double fnl){
        return (vize*0.4)+(fnl*0.6);
    }


}

import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        //Not ortalaması ve harf karşılığı
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Vize Notunuzu Giriniz:");
        int vize=input.nextInt();
        System.out.print("Lütfen Final Notunuzu Giriniz:");
        int fin=input.nextInt();
        int ort=(int)((vize*0.4)+(fin*0.6));
        char notHarf=ort<60?'F':ort<70?'D':ort<80?'C':ort<90?'B':ort<=100?'A':'G';
        System.out.println("Not : "+ort+" ["+notHarf+"]");

    }
}

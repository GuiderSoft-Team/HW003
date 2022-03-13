import java.util.Scanner;

public class Notlar {
    public static void main(String[] args){
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

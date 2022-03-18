import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {
        System.out.println("Lütfen vize ve final not bilgilerini giriniz.");
        Scanner input1=new Scanner(System.in);
        System.out.print("Vize Notu :");
        double vizeNotu=input1.nextDouble();
        Scanner input2=new Scanner(System.in);
        System.out.print("Final Notu :");
        double finalNotu=input2.nextDouble();
        double ortNot=(vizeNotu*0.4)+(finalNotu*0.6);
        if (ortNot>=90){
            System.out.println("Not :"+ortNot+" [A]");
        }else if (ortNot>=80){
            System.out.println("Not :"+ortNot+" [B]");
        }else if(ortNot>=70){
            System.out.println("Not :"+ortNot+" [C]");
        }else if(ortNot>=60){
            System.out.println("Not :"+ortNot+" [D]");
        }else{
            System.out.println("Not :"+ortNot+" [F]");
        }
    }
}

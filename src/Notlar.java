import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen vize ve final notlarını giriniz");
        System.out.print("Vize Notu:");
        double vize= scan.nextDouble();
        System.out.print("Final Notu:");
        double ffinal= scan.nextDouble();
        double not=(vize*0.4)+(ffinal*0.6);
        char notHarf=not<60 ? 'F':not<70 ? 'D':not<80 ? 'C': not<90 ?'B':'A';

        System.out.print(String.format("Not ortalaması:%5.2f",not));
        System.out.println("["+notHarf+"]");

    }
}

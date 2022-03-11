import java.util.Scanner;

public class Notlar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Vize Notu : ");
        int vizeNotu = input.nextInt();
        System.out.print("Final Notu : ");
        int finalNotu = input.nextInt();
        double ortalama = ((double) vizeNotu * 0.4) + ((double) finalNotu * 0.6);
        String notHarfi = "";

        notHarfi = (ortalama < 60) ? "F" : ortalama < 70 ? "D" : ortalama < 80 ? "C" : ortalama < 90 ? "B" : "A";

        System.out.print("Not : " + (int) ortalama + " [" + notHarfi + "]");

    }
}

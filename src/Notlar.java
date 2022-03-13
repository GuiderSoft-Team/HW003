import java.util.Scanner;
  public class Notlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihren Klausur Note ein :");
        int klausurNote= input.nextInt();

        System.out.println("Bitte geben Sie Ihren Abschlussprüfung ein :");
        int abschlussprüfung = input.nextInt();

        double punkt = klausurNote * 0.4 + abschlussprüfung * 0.6;


        String punktBuchstabe = punkt < 60? "[F]": punkt < 70? "[D]": punkt < 80? "[C]": punkt < 90? "[B]": punkt <= 100? "[A]": "Ungültige Punktzahl";
        System.out.println("punkt : "+punkt+" "+punktBuchstabe);
    }
}

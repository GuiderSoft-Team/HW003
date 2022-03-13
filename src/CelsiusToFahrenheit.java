import java.util.Scanner;
  public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Anwendung zur Temperaturumwandlung");
        System.out.println("1. Celcius - Fahrenheit");
        System.out.println("2. Fahrenheit - Celcius");
        System.out.println("Abstimmung : ");

        int Abstimmung = input.nextInt();

        double c,f;
        System.out.print("Bitte geben Sie den Temperaturwert ein :");
        double Temperaturwert = input.nextDouble();

        switch (Abstimmung) {
            case 1:
                f = Temperaturwert*1.8+32;
                System.out.println(Temperaturwert +"C"+" -------> "+f+" F");
                break;
            case 2 :
                c = (Temperaturwert-32)/1.8;
                System.out.println(Temperaturwert+ "F"+" -------> "+c+" C");
            default :
                System.out.println("Sie haben einen falschen Wert eingegeben");
                break;
        }
    }
}

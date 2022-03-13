import java.util.Scanner;

class CelsiusToFahrenheit {
    CelsiusToFahrenheit() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fahrenheit değerini giriniz : ");
        double a = sc.nextDouble();
        System.out.print("Santigrat derecisi : " + santigrat(a));
    }

    static double santigrat(double f) {
        return (f - 32.0D) * 5.0D / 9.0D;
    }
}
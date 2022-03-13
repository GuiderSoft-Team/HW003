import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("TEMPERATURE CONVERSION APPLICATION");
        System.out.println("------------------------------------");
        System.out.println("1.Centigrade to Fahrenheit");
        System.out.println("2.Fahrenheit to Centigrade");

        while(true) {
            System.out.print("Please choose any one to make a convertion:");

            int choise = scan.nextInt();
            double f, c;
            if (choise == 1) {
                System.out.print("Please enter the degree of centrigrade: ");
                c = scan.nextDouble();
                f = (c * 1.8) + 32;
                System.out.println(" The result of convertion :" + c + " centigrade is " + f + " fahrenheit");
            } else if (choise == 2) {
                System.out.print("Please enter the degree of fahrenheit:");
                f = scan.nextDouble();
                c = (f - 32) / 1.8;
                System.out.println(" The result of convertion : " + f + "fahrenheit is " + c + " centigrade");

            } else {

                System.out.println("You made a wrong choise! Please enter again:");

            }
        }

    }
}

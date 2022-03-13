import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.Celsius - Fahrenheit");
        System.out.println("2.Fahrenheit - Celsius");

        System.out.println("Choice : ");
        int choice= input.nextInt();

        double c,f;
        System.out.println("Enter the temprature value : ");
        double tempraturevalue= input.nextFloat();

        switch (choice){
            case 1:
                f=tempraturevalue*1.8+32;
                System.out.println(tempraturevalue+ "C"+"---->"+f+"F");
            break;
            case 2:
                c = (tempraturevalue-32)/1.8;
                System.out.println(tempraturevalue+"F"+"---->"+c+"C");
            default:
                System.out.println("Entered a false value");
        }
    }
}

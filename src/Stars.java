import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Stars : ");
        int star = input.nextInt();
        System.out.println("Number of Columns : ");
        int columns = input.nextInt();

        for (int a = 1; a < star; a++) {
            System.out.print("*");
            if (a %  columns <= 0){
                System.out.print("\n");
            }
        }
        }
    }



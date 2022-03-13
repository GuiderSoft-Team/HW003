import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {


     Scanner scan =new Scanner(System.in);
        System.out.print("Please enter a column number: ");
        int column= scan.nextInt();
        System.out.print("Please enter the number of stars: ");
        int star= scan.nextInt();

        for(int i=1;i<=star;i++) {
            System.out.print("*"+"\t");
            if(i%column<=0){
                System.out.println(" ");
            }
        }

    }
}

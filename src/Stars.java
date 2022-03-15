import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
                System.out.print("Lütfen Yildiz Adedi Giriniz :");
        int yildizAdedi=input.nextInt();
                System.out.print("Lütfen Sütun Adedi Giriniz  :");
        int sütunAdedi=input.nextInt();
        for (int i = 1; i <=yildizAdedi; i++) {
                System.out.print("\t*");
            if(i%sütunAdedi==0) {
                System.out.print("\n");
            }
        }
    }
}
        
        
        




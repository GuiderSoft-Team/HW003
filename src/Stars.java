import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Yıldız adedi giriniz: ");
        double adet=input.nextInt();
        System.out.print("Sütun adedi giriniz: ");
        double sutun=input.nextInt();
        double kalan=adet%sutun;
        for (int i = 0; i+1 < adet/sutun; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("  *\t");
            }
            System.out.println();
        }
        for (double k = 0; k+1 <= kalan; k++) {
            System.out.print("  *\t");
        }
/*      :DDDD           */

    }
}

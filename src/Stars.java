import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yıldız adedini seçiniz : ");
        int yildiz = input.nextInt();
        System.out.print("Sütun adedini seçiniz : ");
        int sutun = input.nextInt();

        for (int i = 1; i < yildiz + 1; i++) {
            System.out.print("*\t");
            if (i % sutun == 0) {
                System.out.print("\n");
            }
        }

    }
}

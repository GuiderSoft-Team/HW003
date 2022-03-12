import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
                System.out.print("Yıldız sayısını giriniz : ");
                int mode = input.nextInt();
                System.out.print("Sütun sayısını giriniz : ");
                int sutun = input.nextInt();

                for (int i = 1; i < mode + 1; i++) {
                    System.out.print("*\t");
                    if (i % sutun == 0)
                        System.out.print("\n");
                }

            }
        }


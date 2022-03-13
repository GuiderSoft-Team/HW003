import java.util.Scanner;

public class Stars
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int yildizsayisi = 54, sutun = 10 ;
        System.out.print("Yıldız sayısını girin : ");
        yildizsayisi=reader.nextInt();
        System.out.print("Sutun sayısını girin : ");
        sutun=reader.nextInt();
        int i = 1;
        while (true) {
            if (i > yildizsayisi) break;
            System.out.print("*");
            if (i % sutun == 0) System.out.println();
            i++;
        }

    }
}

import java.util.Scanner;

public class Stars_2 {
    public static void main(String[] args) {
        // Klavyeden girilen sayı kadar yıldızı ekrana tablo halinde yazan bir program yazınız.
        /*
            Ekran:
            Yıldız Adedi:
            Sütun Adedi :


            Örnek;
            Yıldız Adedi: 54
            Sütun Adedi : 12
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*	*	*	*	*	*	*
            *	*	*	*	*	*
         */


        Scanner sc=new Scanner(System.in);
       int yildizSayisi=0;
       int sutun=0;

        System.out.print("İstediğiniz yıldız adedi sayısını giriniz:");
        yildizSayisi=sc.nextInt();
        System.out.print("Stun adedi sayısını giriniz:");
        sutun=sc.nextInt();

        for (int i = 1; i < yildizSayisi + 1; i++) {
            System.out.print("*\t");
            if (i % sutun == 0) {
                System.out.print("\n");

            }
        }
    }
}

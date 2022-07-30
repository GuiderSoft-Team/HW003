import java.util.Scanner;

public class Stars {
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

        Scanner input = new Scanner(System.in);
        System.out.print("Yıldız Adedi : ");
        int yildiz = input.nextInt();
        System.out.print("Sütün Adedi : ");
        int sutun = input.nextInt();
        while (yildiz > 0) {
            String a = "";
            for (int i = 0; i < sutun; i++) {
                if (yildiz > 0) {
                    a = a + " *";
                }
                yildiz = yildiz - 1;
            }
            System.out.println(a);
        }
    }
}




import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen sayı kadar yıldızı ekrana tablo halinde yazan bir program yazınız.
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
        System.out.println("Yildiz Adedi:");
        int yildiz = input.nextInt();

        System.out.println("Sütun Adedi:");
        int sütun = input.nextInt();

        while (yildiz > 0) {
            String s = " ";
            for (int i = 0; i < yildiz; i++) {
                if (yildiz > 0) {
                    s = s + "*";
                }
                yildiz = yildiz - 1;
            }
            System.out.print(s);

        }
    }
}

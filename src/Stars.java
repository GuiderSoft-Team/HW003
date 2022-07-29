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

      /* System.out.print("Yilidz Adedi: ");
        int yildiz = scan.nextInt();
        System.out.print("Sutun Adedi: ");
        int sutun=scan.nextInt();
    }
}
*/
      /*  Scanner scan = new Scanner(System.in);
       System.out.print("Yilidz Adedi: ");
        int yildiz = scan.nextInt();
        System.out.print("Sutun Adedi: ");
        int sutun = scan.nextInt();
        while (yildiz>0);
        int i = 0;
            for (i = 0; i >= sutun; i++) ;
        int j;
            for (j = 0; j >= yildiz; j++) {
            System.out.println("*");
        }
        System.out.println("*");*/
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




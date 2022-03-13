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

Scanner input=new Scanner(System.in);
        System.out.print("lütfen yıldız adedini giriniz=");
        int YildizAdedi=input.nextInt();
        System.out.print("lütfen sütun adedini giriniz=");
        int SutunAdedi=input.nextInt();

        for (int i = 1; i <= YildizAdedi; i++) {
            System.out.print("*\t");
            if (i % SutunAdedi == 0) {
                System.out.print("\n");
            }

        }

    }
}

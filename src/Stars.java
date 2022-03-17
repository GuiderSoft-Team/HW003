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

        System.out.println("Yıldız Tablosu");
        System.out.println("*---------------*");
        System.out.println("Sayıları Giriniz:");
        System.out.println("v-------v");

        int yildizAdedi,sutunAdedi;

        System.out.print("Yıldız Adedi:");
        yildizAdedi=input.nextInt();
        System.out.print("Sütun Adedi:");
        sutunAdedi=input.nextInt();

        for (int i = 1; i <=sutunAdedi; i++) {
            for (int j = 1; j <=yildizAdedi; j++) {
                System.out.print("*"+"\t");
                }
            }
            System.out.println();
        }

    }


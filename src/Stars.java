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

        System.out.print("Ne kadar yıldızın olsun: ");
        int star = input.nextInt();
        System.out.print("Kaç Sütun gözüksün: ");
        int stn = input.nextInt();


        for (int i = 0; i < star; i++) {
            System.out.print("*" + "\t");
            for (int j = 0; j <stn ; j++) {
            }

            }
        System.out.println("yapamadım");

        }
    }













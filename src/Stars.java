import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen sayı kadar yıldızı ekrana tablo halinde yazan bir program yazınız.
        System.out.println("Yıldız Tablosu");
        System.out.println("----------------------");
        Scanner input=new Scanner(System.in);
        System.out.print("Yıldız sayısını giriniz : ");
        int yildizAdedi=input.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        int sütünAdedi=input.nextInt();
        int sayac=0;


        for (int i =0; i <yildizAdedi ; i++) {
            for (int j = 0; j < sütünAdedi; j++) {
                System.out.print("*\t");
                sayac++;

                if (sayac == sütünAdedi) {
                break;
                }

            }sayac++;
            if(sayac==yildizAdedi) {
                break;

            }
            System.out.println();
        }




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


    }
}

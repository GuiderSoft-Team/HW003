import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        double row;
        System.out.println("enter a number to print \"*\"");

        number= input.nextInt();
        row=Math.ceil(number/(double)12);


        for (int x=1;x<=number;x++)
        {
            System.out.print("*");
            if (x%12==0)
            {
                System.out.println();
            }
        }

        System.out.printf("%nyildiz adedi: %d %nsutun adedi:%.0f",number,row);

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


    }
}

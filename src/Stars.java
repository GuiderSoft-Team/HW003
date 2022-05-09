import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("yıldız adeti :");
        int yıldızAdetı = input.nextInt();
        System.out.print("sutun adeti :");
        int sutunAdetı = input.nextInt();
        int satırSayısı = yıldızAdetı / sutunAdetı;
        int satırSayısımodu = yıldızAdetı % sutunAdetı;
        if (yıldızAdetı<sutunAdetı){
            System.out.println("Sutun sayısı Yıldız adetinden büyük olamaz125");
            return;
        }
        for (int i = 1; i <=satırSayısı ; i++) {
            for (int j = 1; j <=sutunAdetı ; j++) {
                System.out.print(" * ");

            }
            System.out.println(" ");

        }
        if (satırSayısımodu !=0){
            for (int i = 1; i <=satırSayısımodu ; i++) {
                System.out.print(" * ");

            }
        }
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

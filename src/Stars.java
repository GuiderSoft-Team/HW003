import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        System.out.println("Lütfen ekrana yazdırmak istediğiniz yıldız sütunları bilgilerini giriniz.");
        Scanner input1=new Scanner(System.in);
        System.out.print("Yıldız adedi: ");
        int star=input1.nextInt();
        Scanner input2=new Scanner(System.in);
        System.out.print("Sütün adedi: ");
        int column=input2.nextInt();
        int sayac=0;
        for(int i=0;i<star;i++) {
            for (int k=0;k<column;k++){
                System.out.print("*\t");
                sayac++;
                if (sayac==star){
                    break;
                }
            }
            if (sayac==star){
                break;
            }
            System.out.println();
        }
    }
}


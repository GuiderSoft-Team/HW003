import java.util.Scanner;
public class Notlar {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int vizeNot,finalNot;
        double ortalama;
        String durum="";
        System.out.print("Vize Notunuzu Girin : ");
        vizeNot=reader.nextInt();
        System.out.print("Final Notunuzu Girin : ");
        finalNot=reader.nextInt();
        ortalama=vizeNot*0.4+finalNot*0.6;
        if (ortalama<59) {durum="Dersi Geçemediniz";}
        else if (ortalama>=60) {durum="Dersi Geçtiniz Tebrikler";}
        if(ortalama>90) {durum="A"; }
        else if((ortalama>80)&&(ortalama<=89)) {durum="B"; }
        else if((ortalama>70)&&(ortalama<=79)) {durum="C"; }

        else if((ortalama>60)&&(ortalama<=69)) {durum="D"; }
        else if((ortalama>0)&&(ortalama<=59)) {durum="F"; }

        else {durum="F,Üzgünüz Kaldınız.";}
        
        System.out.println("Ortalama : " + ortalama);

        System.out.println("Durumunuz: " + durum);
    }

}
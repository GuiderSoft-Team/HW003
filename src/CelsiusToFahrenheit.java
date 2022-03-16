import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //TODO: Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.
        /*
            Örnek Menü Tasarımı:

            Sıcaklık Dönüşüm Uygulaması
            1. Santigrat - Fahrenheit
            2. Fahrenheit - Santigrat
            Seçim :
            -------------------------
            Formül: F=Cx1.8+32
                    C=(F-32)/1.8
             -----------------------
            Örnek;  F=30x1.8+32=86
                    C=(86-32)/1.8=30
            -------------------------
             Ekran Çıktısı:
             30 C --> 86 F
             86 F --> 30 C
         */
        System.out.println("Sıcaklık Dönüşüm Uygulaması\n1. Santigrat - Fahrenheit\n2. Fahrenheit - Santigrat\nSeçim :");
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();

        if(choice==1){
            System.out.println("Santigrat girişi yapınız : ");
            double santi= input.nextDouble();
            celciustoFahrenheit(santi);
        }else if (choice==2){
            System.out.println("Fahrenheit girişi yapınız : ");
            double fahren=input.nextDouble();
            fahrenheittoCelcius(fahren);
        }else{
            System.out.println("Geçerli bir seçim yapmadınız. ");
        }

    }

    public static void celciustoFahrenheit (double celcius){
        double fahrenheit=(celcius*1.8)+32;
        System.out.println("Celcius  = "+celcius+"  =>  "+"Fahrenheit = "+fahrenheit);
    }

    public static void fahrenheittoCelcius (double fahrenheit) {
        double celcius=(fahrenheit-32)/1.8;
        System.out.println("Fahrenheit = "+fahrenheit+"  =>  "+"Celcius  = "+celcius);

    }




}

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //Klavyeden girilen Sıcaklık değerleri, diğer birime dönüştürülecektir.
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

        System.out.println("76F---> "+convertFahrenheittoCelcius(76)+"C");
        System.out.println("50F---> "+convertFahrenheittoCelcius(50)+"C");

        int f=80;
        System.out.println(String.format("%d F---> %5.1f C",f,convertFahrenheittoCelcius(f)));

        convertFahrenheittoCelcius(95.8);


    }

    public static double convertFahrenheittoCelcius(double grade) {
        return (grade-32)/1.8;
    }
        public static double convertFahrenheittoCelcius(int grade){
            return (grade-32)/1.8;
        }

    }


import java.util.Scanner;
  public class Stars {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Anzahl Sterne :");
        int sterne = input.nextInt();
        System.out.print("Anzahl der Spalten :");
        int spalten = input.nextInt();


        while(sterne > 0) {
            String s= "";
                for (int i = 0; i < spalten ; i++){
                    if (sterne > 0) {
                        s = s + " * " ;
                    }
                    sterne = sterne -1;
                }
                System.out.print(s);
            }
    }
}

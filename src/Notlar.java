import java.util.Scanner;
public class Notlar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first exam score : ");
        int firstExamScore= input.nextInt();

        System.out.println("Please enter your fineal exam score : ");
        int finalExamScore= input.nextInt();

        double score =firstExamScore*0.4+finalExamScore*0.6;
        String grade = score < 60? "[F]": score < 70? "[D]": score <80? "[C]": score <90? "[B]": score<=100? "[A]" : "invalid score";
        System.out.println("Score : " +score+" "+grade);
    }
}

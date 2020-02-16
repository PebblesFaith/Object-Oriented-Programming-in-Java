import java.util.Arrays;
import java.util.Scanner;

public class Module1MeetArrayOnlineLectureExample3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates your grades. ");
        System.out.print("How many grades would you like to enter? ");

        int numGrades = input.nextInt();
        int[] myGrades = new int[numGrades];

        for (int i = 0; i < myGrades.length; i++) {
            System.out.print("Homework assignment " + (i + 1) + " score: ");
            myGrades[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < myGrades.length; i++) {
            sum += myGrades[i];
        }
        int avg = sum / myGrades.length;
        int aboveAvg = 0;
        for (int i = 0; i < myGrades.length; i++) {
            if (myGrades[i] > avg) {
                aboveAvg++;
            }
        }
        System.out.println("Average Homework Overall Score = " + avg);
        System.out.println(aboveAvg + " HOMEWORK[S] was [were] above average.");
    }
}

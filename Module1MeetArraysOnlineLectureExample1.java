import java.util.Scanner;
public class Module1MeetArraysOnlineLectureExample1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates your overall grades. ");
        System.out.println("Enter in your Homework Scores: ");
        double sum = 0.0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Homework " + i + " score: ");
            sum += input.nextInt();
        }
        System.out.println("Average Homework Overall Score = " + (sum/7));
    }
}

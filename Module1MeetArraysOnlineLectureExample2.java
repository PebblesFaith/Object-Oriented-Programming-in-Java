// Module 1 | Meet Arrays Example 1
// Completed by: Sarai Hannah Ajai
// on April 20, 2020

import java.util.Scanner;
public class Module1MeetArraysOnlineLectureExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates your overall grades. ");
        System.out.println("Enter in your Homework Scores: ");
        int hw1 = getHWScore(input, 1);
        int hw2 = getHWScore(input, 2);
        int hw3 = getHWScore(input, 3);
        int hw4 = getHWScore(input, 4);
        int hw5 = getHWScore(input, 5);
        int hw6 = getHWScore(input, 6);
        int hw7 = getHWScore(input, 7);

        int sum = hw1 + hw2 + hw3 + hw4 + hw5 + hw6 + hw7;
        int average = sum/7;
        int aboveAvg = 0;

        if (hw1 > average) {
            aboveAvg++;
        } if (hw2 > average) {
            aboveAvg++;
        } if (hw3 > average) {
            aboveAvg++;
        } if (hw4 > average) {
            aboveAvg++;
        } if (hw5 > average) {
            aboveAvg++;
        } if (hw6 > average) {
            aboveAvg++;
        } if (hw7 > average) {
            aboveAvg++;
        }

        System.out.println("Average Homework Overall Score = " + (sum/7));
        System.out.println(aboveAvg + " HOMEWORK[S] was [were] above average.");
    }

    public static int getHWScore(Scanner input, int num) {
        System.out.print("Homework " + num + " score: ");
        return input.nextInt();
    }


}

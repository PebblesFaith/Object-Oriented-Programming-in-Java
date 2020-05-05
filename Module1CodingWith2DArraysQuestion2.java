// Module 1 | Coding with 2D Arrays Question 2
// Completed by: Sarai Hannah Ajai
// on May 5, 2020

import java.util.Arrays;

public class Module1CodingWith2DArraysQuestion2 {
    public static void main(String[] args) {
        int [][] b = new int[2][2];
        int count = 0;

        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                b[row][col] = count;
                count++;

                System.out.println(b[row][col]);
            }
            System.out.println();
        }

    }
}

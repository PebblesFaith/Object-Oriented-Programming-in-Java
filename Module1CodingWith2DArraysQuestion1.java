// Module 1 | Coding with 2D Arrays Question 1
// Completed by: Sarai Hannah Ajai
// on May 5, 2020

import java.util.Arrays;

public class Module1CodingWith2DArraysQuestion1 {
    public static void main(String []args){
        int[][] a = new int[2][5];

        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[0][3] = 1;
        a[0][4] = 2;
        a[1][0] = 3;
        a[1][1] = 1;
        a[1][2] = 2;
        a[1][3] = 3;
        a[1][4] = 3;


        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = col;

                System.out.println(a[row][col]);

            }
            System.out.println();
        }

    }


}

// Module 1 | Meet 2D Arrays Question 1
// Completed by: Sarai Hannah Ajai
// on May 5, 2020

import java.util.Arrays;

public class Module1Meet2DArraysQuestion1 {
    public static void main(String[] args) {
        int [][] c = new int[5][4];
        c[0][0] = 1;
        c[0][1] = 2;
        c[0][2] = 3;
        c[1][0] = 1;
        c[1][1] = 2;
        c[1][2] = 3;

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }



    }




}
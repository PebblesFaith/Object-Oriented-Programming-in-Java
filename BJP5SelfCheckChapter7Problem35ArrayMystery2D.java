/* Object Oriented Programming in Java (Microsoft Dev 277x) course from Instructor, Kasey Champion's
   Practice-It! Assignment for BJP4 Self-Check 7.35 Array Mystery 2D.
   Completed by Sarai Hannah Ajai Dated on May 04, 2020. */

import java.util.Arrays;


public class BJP5SelfCheckChapter7Problem35ArrayMystery2D {
    public static void main(String [] args){

        int[][] numbers = new int[3][4];

        numbers[0][0] = 3;
        numbers[0][1] = 4;
        numbers[0][2] = 5;
        numbers[0][3] = 6;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        numbers[1][3] = 7;
        numbers[2][0] = 5;
        numbers[2][1] = 6;
        numbers[2][2] = 7;
        numbers[2][3] = 8;

        mystery2d(numbers);
    }

    public static void mystery2d(int[][] a) {
        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[0].length - 1; c++) {
                if (a[r][c + 1] > a[r][c]) {
                    a[r][c] = a[r][c + 1];

                }
                System.out.println(a[r][c] + " ");
            }
            System.out.println();
        }
    }
}


/* Object Oriented Programming in Java (Microsoft Dev 277x) course from Instructor, Kasey Champion's
   Practice-It! Assignment for BJP4 Self-Check 7.31 Array Coding Tracing 2D.
   Completed by Sarai Hannah Ajai Dated on May 04, 2020. */

import java.util.Arrays;

public class BJP5SelfCheckChapter7Problem31ArrayCodingTracing2D {
    public static void main(String [] args){
        int [][] numbers = new int[3][4];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;
        numbers[1][0] = 1;
        numbers[1][1] = 2;
        numbers[1][2] = 3;
        numbers[1][3] = 4;
        numbers[2][0] = 1;
        numbers[2][1] = 2;
        numbers[2][2] = 3;
        numbers[2][3] = 4;

        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[0].length; c++) {

                numbers[r][c] = r + c;
                System.out.println(numbers[r][c] + " ");
            }
            System.out.println();
        }
    }
}

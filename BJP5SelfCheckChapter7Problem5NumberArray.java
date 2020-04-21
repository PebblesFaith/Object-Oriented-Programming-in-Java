/* Object Oriented Programming in Java (Microsoft Dev 277x) course from Instructor, Kasey Champion's
   Practice-It! Assignment for BJP4 Self-Check 7.5 numbersArray.
   Completed by Sarai Hannah Ajai Dated on April 21, 2020. */

import java.util.Arrays;
public class BJP5SelfCheckChapter7Problem5NumberArray {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        numbers[1] = 4;
        numbers[4] = 99;
        numbers[7] = 2;

        int x = numbers[1]; // Numbers[1] index is equal to the value of 4 that is replace by Numbers[4] index location of the value of 44.
        numbers[x] = 44;
        numbers[numbers[7]] = 11; // Numbers[7] index that is equal to the eleven (11) value is replace to the index value of two (2) location.

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

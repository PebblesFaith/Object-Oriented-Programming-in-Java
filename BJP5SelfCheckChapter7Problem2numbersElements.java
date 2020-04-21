/* Object Oriented Programming in Java (Microsoft Dev 277x) course from Instructor, Kasey Champion's
   Practice-It! Assignment for BJP4 Self-Check 7.2 numbersElements.
   Completed by Sarai Hannah Ajai Dated on April 21, 2020. */

import java.util.Arrays;

public class BJP5SelfCheckChapter7Problem2numbersElements {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;
        numbers[8] = 8;
        numbers[9] = 9;


        for (int i = 0; i < numbers.length; i++)

        System.out.println("The element is integer " + numbers[i] + ".");
        System.out.println("The last element is " + numbers[numbers.length-1] + ".");
    }
}

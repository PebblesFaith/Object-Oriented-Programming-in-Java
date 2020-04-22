// Module 1 | Coding With Arrays Example 1
// Completed by: Sarai Hannah Ajai
// on April 21, 2020

import java.util.Arrays;

public class Module1CodingWithArraysOnlineNotesExample1 {
    public static void main(String[] args) {
        int [] a = new int[5];
        double[] b = new double[10];
        char [] c = new char[20];


        int aLength = a.length; // returns 5
        int bLength = b.length; // returns 10
        int cLength = c.length; // returns 20

        for (int i = 0; i < aLength; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < bLength; i++) {
            System.out.println(b[i]);
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(Arrays.toString(c));
        }


    }
}

// Module 1 | Reference Semanitcs Online Quiz 2
// Completed by: Sarai Hannah Ajai
// Dated on April 29, 2020

import java.util.Arrays;

public class Module1ReferenceSemanticsOnlineNotesQuizQuestion2 {
    public static void main(String[] args){
        String [] a = new String[3];
        a[0] = "One";
        a[1] = "Two";
        a[2] = "Three";

        String [] b = a;

        b = Arrays.copyOf(a, a.length);

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}

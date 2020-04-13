// Module 1 | Primitives and Objects Online Lecture Example 2
// Completed by: Sarai Hannah Ajai
// on April 13, 2020

import java.util.Arrays;
public class Module1PrimitivesVSObjectsOnlineLectureExample2 {
    public static void main(String[] args) {
        System.out.println("Java String Array Initialization after declaration.");
        String[] strArray = new String[5];
        strArray[0] = "C";
        strArray[1] = "h";
        strArray[2] = "a";
        strArray[3] = "r";
        strArray[4] = "s";
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i]);
        }
    }
}

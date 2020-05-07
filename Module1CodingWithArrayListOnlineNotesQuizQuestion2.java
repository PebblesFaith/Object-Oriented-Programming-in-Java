/*
   Object Oriented Programming in Java (Microsoft Dev 277x) online course from Instructor, Kasey Champion's
   Online Notes Quiz for Question two (2) has two possible answers to question two (2) quiz as follows:
   1. the array index is out of bounds thrown exception because index of the last object, element or the
   value is semantic is one (1) less than when I had started the loop this means, if I did not adjust
   the loop variable then I will run off the end; and
   2. my Arraylist variable, myList is untouched because the loop will never run properly due to the
   out of bounds thrown exception;
   Completed by Sarai Hannah Ajai Dated on May 07, 2020.

 */
import java.util.ArrayList;

public class Module1CodingWithArrayListOnlineNotesQuizQuestion2 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Dogs");
        myList.add("Cats");
        myList.add("Birds");

        for (int i = 0; i < myList.size(); i++) {
            myList.remove(i);
            System.out.println(i);
        }

        System.out.println(myList);


    }
}

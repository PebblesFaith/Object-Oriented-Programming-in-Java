/*
   In my Object Oriented Programming in Java (Microsoft Dev 277x) online course from the Instructor, Kasey Champion's
   online tutorial's example1 illustrates, how should I write, my own classes that serves, as a blueprints
   for a new types of objects displays in the example below are students' attributes or specifications in classes. And, After, I have
   written, my students' classes then I had created a new Java File Program Module2WritingYourOwnObjectOnlineNoteExample1App;
   in order to Construct these objects, as references of those classes.
   Completed by Sarai Hannah Ajai Dated on May 15, 2020.
 */

public class Module2WritingYourOwnObjectOnlineNoteExample1App {
    public static void main(String[] args) {
        Module2WritingYourOwnObjectsOnlineNoteExample1 student1 = new Module2WritingYourOwnObjectsOnlineNoteExample1("Suzy", "Q", 12345, "Accountancy", 2.8, 41, 5, false);
        Module2WritingYourOwnObjectsOnlineNoteExample1 student2 = new Module2WritingYourOwnObjectsOnlineNoteExample1("Holly", "TooBlue", 12346, "Mathematic", 3.2, 23, 2, false);

        System.out.println("Student 1: " + student1.firstName + " " + student1.lastName + " " + student1.id + " " + student1.major + " " + student1.gpa + " " + student1.age + " " + student1.abs + " " + student1.onProbation);
        System.out.println("Student 2: " + student2.firstName + " " + student2.lastName + " " + student2.id + " " + student2.major + " " + student2.gpa + " " + student2.age + " " + student2.abs + " " + student2.onProbation);




    }
}

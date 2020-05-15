/*
   In my Object Oriented Programming in Java (Microsoft Dev 277x) online course from the Instructor, Kasey Champion's
   online tutorial's example1 illustrates, how should I write, my own classes that serves, as a blueprints
   for a new types of objects displays in the example below are students' attributes or specifications in classes. And, After, I have
   written, my students' classes then I had created a new Java File Program Module2WritingYourOwnObjectOnlineNoteExample1App;
   in order to Construct these objects, as references of those classes.
   Completed by Sarai Hannah Ajai Dated on May 15, 2020.
 */
public class Module2WritingYourOwnObjectsOnlineNoteExample1 {
        String firstName;
        String lastName;
        int id;
        String major;
        double gpa;
        int age;
        int abs;
        boolean onProbation;


        public Module2WritingYourOwnObjectsOnlineNoteExample1(String firstName, String lastName, int id, String major, double gpa, int age, int abs, boolean onProbation) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
            this.major = major;
            this.gpa = gpa;
            this.age = age;
            this.abs = abs;
            this.onProbation = onProbation;
    }
}

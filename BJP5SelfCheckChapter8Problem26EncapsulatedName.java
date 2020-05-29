/* Object Oriented Programming in Java (Microsoft Dev 277x) course by Instructor  Kasey Champion's
   Practice-It! Assignment for BJP5 Self-Check 8.26 Encapsulated Name with Class Object and Client Java File Programs
   Completed by Sarai Hannah Ajai Dated on May 28, 2020. */


public class BJP5SelfCheckChapter8Problem26EncapsulatedName {
    private String firstName;
    private char middleInitial;
    private String lastName;


    private void fullName(String firstName, String lastName, char middleInitial) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;

    }



    public String getFirstName() {
        return "John";
    }
    public char getMiddleInitial() { return 'Q'; }
    public String getLastName() {
        return "Public";
    }






}

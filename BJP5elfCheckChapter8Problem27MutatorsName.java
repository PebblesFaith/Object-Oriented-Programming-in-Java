/*   I, Sarai Hannah Ajai had completed, my college textbook (“Building Java Programs, A Back
     to Basics Approach 5e”) chapter 8, Self Check's problem number twenty-seven (27) from Practice It(!)
     online and, I had discovered Practice It(!) JVM or IDE Compiler has programmatic glitches
     compared to my online ran Java file program JVM or IDE, after executions. So, my Practice
     It(!) chapter 8, Self Check's' problem number twenty-seven (27) does not compile properly; in
     order to display my submitted Java written codes that executed or ran incorrectly onto the online
     Practice It(!) JVM or IDE Compiler web application. Please keep in mind, there is more than
     one way to write, my Java written codes to solve Practice It(!) chapter 8, Self Check problem
     number twenty-seven (27). Therefore, my Java written codes to solve Practice It(!) chapter 8,
     Self Check's problem number twenty-seven (27) is most lightly correct solution Dated on May 29, 2020.
 */

public class BJP5elfCheckChapter8Problem27MutatorsName {
    private String firstName;
    private char middleInitial;
    private String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public char getMiddleInitial() {
        return this.middleInitial;
    }
    public String getLastName() {
        return this.lastName;
    }

    public static void main(String[] args) {
        BJP5elfCheckChapter8Problem27MutatorsName fullName = new BJP5elfCheckChapter8Problem27MutatorsName();

        fullName.setFirstName("John");
        fullName.setMiddleInitial('Q');
        fullName.setLastName("Public");
        System.out.println("A Name class object mutator represents a person's name such as " + fullName.getFirstName() + " " + fullName.getMiddleInitial() + " " + fullName.getLastName() + ".");
    }

}


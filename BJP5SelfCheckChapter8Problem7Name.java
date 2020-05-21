/*   I, Sarai Hannah Ajai had completed, my college textbook (“Building Java Programs, A Back
     to Basics Approach 5e”) chapter 8, Self Check's problem number seven (7) from Practice It(!)
     online and, I had discovered Practice It(!) JVM or IDE Compiler has programmatic glitches
     compared to my online ran Java file program JVM or IDE, after executions. So, my Practice
     It(!) chapter 8, Self Check's' problem number seven (7) does not compile properly; in
     order to display my submitted Java written codes that executed or ran incorrectly onto the online
     Practice It(!) JVM or IDE Compiler web application. Please keep in mind, there is more than
     one way to write, my Java written codes to solve Practice It(!) chapter 8, Self Check problem
     number seven (7). Therefore, my Java written codes to solve Practice It(!) chapter 8,
     Self Check's problem number seven (7) is most lightly correct solution Dated on May 21, 2020.
 */

public class BJP5SelfCheckChapter8Problem7Name {
    String firstName;
    String lastName;
    String middleInitial;

    public BJP5SelfCheckChapter8Problem7Name(String firstName, String lastName, String middleInitial) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
    }

    public static void main(String[] args) {
        BJP5SelfCheckChapter8Problem7Name name1 = new BJP5SelfCheckChapter8Problem7Name("Jane", "Doe", "C");
        System.out.println(name1.firstName + " " + name1.lastName + " " + name1.middleInitial);

    }
}

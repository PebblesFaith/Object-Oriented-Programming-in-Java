/*   I, Sarai Hannah Ajai had completed, my college textbook (“Building Java Programs, A Back
     to Basics Approach 5e”) chapter 8, Self Check's problem number twenty-one (21) from Practice It(!)
     online and, I had discovered Practice It(!) JVM or IDE Compiler has programmatic glitches
     compared to my online ran Java file program JVM or IDE, after executions. So, my Practice
     It(!) chapter 8, Self Check's' problem number twenty-one (21) does not compile properly; in
     order to display my submitted Java written codes that executed or ran incorrectly onto the online
     Practice It(!) JVM or IDE Compiler web application. Please keep in mind, there is more than
     one way to write, my Java written codes to solve Practice It(!) chapter 8, Self Check problem
     number twenty-one (21). Therefore, my Java written codes to solve Practice It(!) chapter 8,
     Self Check's problem number twenty-one (21) is most lightly correct solution Dated on May 21, 2020.
 */
public class BJP5SelfCheckChapter8Problem21ConstructorPoint {
    int x;
    int y;

    public BJP5SelfCheckChapter8Problem21ConstructorPoint(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public static void main(String[] args) {
        BJP5SelfCheckChapter8Problem21ConstructorPoint addition = new BJP5SelfCheckChapter8Problem21ConstructorPoint(2,10);
        System.out.println(addition.x + addition.y);
    }
}

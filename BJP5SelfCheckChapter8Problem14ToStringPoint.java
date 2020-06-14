/*   I, Sarai Hannah Ajai had completed, my college textbook (“Building Java Programs, A Back
     to Basics Approach 5e”) chapter 8, Self Check's problem number fourteen (14) from Practice It(!)
     online and, I had discovered Practice It(!) JVM or IDE Compiler has programmatic glitches
     compared to my online ran Java file program JVM or IDE, after executions. So, my Practice
     It(!) chapter 8, Self Check's' problem number fourteen (14) does not compile properly; in
     order to display my submitted Java written codes that executed or ran incorrectly onto the online
     Practice It(!) JVM or IDE Compiler web application. Please keep in mind, there is more than
     one way to write, my Java written codes to solve Practice It(!) chapter 8, Self Check problem
     number fourteen (14). Therefore, my Java written codes to solve Practice It(!) chapter 8,
     Self Check's problem number fourteen (14) is most lightly correct solution Dated on May 23, 2020.
 */

import java.awt.*;
public class BJP5SelfCheckChapter8Problem14ToStringPoint {
    int x;
    int y;

    public String toString() {

        return "(" + x + ", " + y + ")";

    }


    public static void main(String[] args) {
        BJP5SelfCheckChapter8Problem14ToStringPoint word1 = new BJP5SelfCheckChapter8Problem14ToStringPoint();

        word1.x = 7;
        word1.y = 2;

        System.out.println("Initially To Strings: " + word1);
        System.out.println();
        System.out.println(word1.x + word1.y);
    }

}

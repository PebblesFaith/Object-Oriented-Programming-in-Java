/*   I, Sarai Hannah Ajai had completed, my college textbook (“Building Java Programs, A Back
     to Basics Approach 5e”) chapter 8, Self Check's problem number ten (10) from Practice It(!)
     online and, I had discovered Practice It(!) JVM or IDE Compiler has programmatic glitches
     compared to my online ran Java file program JVM or IDE, after executions. So, my Practice
     It(!) chapter 8, Self Check's' problem number ten (10) does not compile properly; in
     order to display my submitted Java written codes that executed or ran incorrectly onto the online
     Practice It(!) JVM or IDE Compiler web application. Please keep in mind, there is more than
     one way to write, my Java written codes to solve Practice It(!) chapter 8, Self Check problem
     number ten (10). Therefore, my Java written codes to solve Practice It(!) chapter 8,
     Self Check's problem number ten (10) completed in two (2) versions are most lightly correct
     solutions Dated on May 23, 2020.
 */

import java.util.Scanner;
public class BJP5SelfCheckChapter8Problem10DistancePoint {
    public static final Scanner input = new Scanner(System.in);
    int x1;
    int y1;
    int x2;
    int y2;

    public void input() {
        System.out.print("Enter your first (1st) x1 coordinate for the distance between two (2) point: ");
        int x1 = input.nextInt();
        System.out.print("Enter your second (2nd) y1 coordinate for the distance between two (2) point: ");
        int y1 = input.nextInt();
        System.out.print("Enter your third (3rd) x2 coordinate for the distance between two (2) point: ");
        int x2 = input.nextInt();
        System.out.print("Enter your fourth (4th) y2 coordinate for the distance between two (2) point: ");
        int y2 = input.nextInt();
        System.out.println();

        System.out.println("You have selected x1 as " + x1 + ", y2 as " + y1 + ", x2 as " +  x2 + ", y2 as " + y2 + " for your coordinates in the distance between two (2) points.");
        System.out.println();

        System.out.println("The distance between two (2) points of (x1 - x2) exp of 2 + (y1 - y2) exp of 2) is " + Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)) + ".");

        }

        //public double distance(BJP5SelfCheckChapter8Problem10DistancePoint other) {


        //}







    //public double distance(BJP5SelfCheckChapter8Problem10DistancePoint other) {



    //}



    public static void main(String[] args) {

        BJP5SelfCheckChapter8Problem10DistancePoint calc = new BJP5SelfCheckChapter8Problem10DistancePoint();
        calc.input();
        //calc.distance();



    }

}

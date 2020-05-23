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

public class Point {
    int x;
    int y;

    public double distance() {

        return Math.sqrt(x*x + y*y);

    }
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = -1;
        p1.y = 1;

        Point p2 = new Point();
        p2.x = 3;
        p2.y = 4;

        System.out.println("Distance from Origin = " + p1.distance());
        System.out.println("Distance from Origin = " + p2.distance());
        System.out.println();
        System.out.println("The distance between two (2) points of (x1 - x2) exp of 2 + (y1 - y2) exp of 2) is " + Math.sqrt(Math.pow((p1.x-p2.x), 2) + Math.pow((p1.y-p2.y), 2)) + ".");

    }
}



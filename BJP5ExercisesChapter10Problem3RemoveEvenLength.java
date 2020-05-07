/*
    I, Sarai Hannah Ajai had completed, my college textbook (“Building Java Programs, A Back to Basics Approach 5e”) chapter 10, Exercises' problem
    number three (3) from Practice It(!) online and, I had discovered Practice It(!) JVM or IDE Compiler programmatic glitches with my online ran Java
    file program after executions. So, my Practice It(!) chapter 10, Exercises' problem number three (3) does not compile properly; in order to display
    my submitted Java written codes executed or ran correctly onto the online Practice It(!) JVM or IDE Compiler web application.  Please keep in mind, there is more than
    one way to write, my Java written codes to solve Practice It(!) chapter 10, Exercises' problem number three (3). Therefore, my Java written codes to
    solve Practice It(!) chapter 10, Exercises' problem number three (3) is most lightly correct solution Dated on May 7, 2020.
 */

import java.util.ArrayList;
public class BJP5ExercisesChapter10Problem3RemoveEvenLength {
    public static void main(String[] args) {
        System.out.println();
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("list of Array list Vegetables: ");
        list.add("Garden Asparagus");
        list.add("Cabbage");
        list.add("Celery");
        list.add("Brussels Sprout");
        list.add("Carrots");
        list.add("Cucumbers");
        list.add("Cauliflower");
        list.add("Avocados");
        list.add("Ginger");
        list.add("Collard Greens");
        list.add("Mustard Green");
        list.add("Radish");
        list.add("Leek");
        list.add("Eggplant");
        list.add("Fennel");
        list.add("Zucchini");
        list.add("Tomatillo");
        list.add("Sweet Potato");
        list.add("Jerusalem Artichoke");
        list.add("Bell Pepper");
        list.add("Fiddlehead");
        list.add("Daikon");

        System.out.println(list);
        removeEvenLength(list);

        /*
        for (int i = 0; i < list.size(); i++){
            String vegetables = list.get(i);
            System.out.println(vegetables);

         */

        }
        public static void removeEvenLength(ArrayList<String> list) {
            System.out.println();
            for (int i = 0; i < list.size(); i++){
                list.remove(i);

                String evenLength = list.get(i);
                System.out.println("List of odd vegetable at new index location | " + i + " | "+ "  " + evenLength);

            }

        }




}

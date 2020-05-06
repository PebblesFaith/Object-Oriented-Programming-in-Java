/*
    I, Sarai Hannah Ajai had completed, my college textbook (“Building Java Programs, A Back to Basics Approach 5e”) chapter 10, Self Check’s problem
    number eight (8) from Practice It(!) online and, I had discovered Practice It(!) JVM or IDE Compiler programmatic glitches with my online ran Java
    file program after executions. So, my Practice It(!) chapter 10, Self Check’s problem number eight (8) does not compile properly; in order to display
    my submitted Java written codes executed or ran correctly onto the online Practice It(!) JVM or IDE Compiler.  Please keep in mind, there is more than
    one way to write, my Java written codes to solve Practice It(!) chapter 10, Self Check’s problem number eight (8). Therefore, my Java written codes to
    solve Practice It(!) chapter 10, Self Check’s problem number eight (8) is most lightly correct solution Dated May 6, 2020.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class BJP5SelfCheckChapter10Problem8MaxLength {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();


        list.add("Owls");
        list.add("Parrots");
        list.add("Hummingbirds");
        list.add("Thrush");
        list.add("Swans");
        list.add("Falcons");
        list.add("Pelicans");


        int maxLength = list.get(0).length();
        int index = 0;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
                index = i;
            }
        }
        System.out.println("The index (two) " + index + ", "+ list.get(index) + " " + "is the longest strings and, index " + index + " (two) in size is " + maxLength + " characters.");






    }
}

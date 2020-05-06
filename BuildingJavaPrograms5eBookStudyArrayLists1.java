/* I, Sarai Hannah Ajai had modified, my college textbook (Building Java Programs, A Back to
   Basic Approach 5e) example on page 675 because these authors "removal of duplicates from a
   list" textbook example did not execute or run properly onto my JVM or IDE Compiler. Therefore, I have rewritten
   the example on page 675 in order to comply with these authors intentional Java programmatic logic
   for control structures dated on May 6, 2020, as Follows:

 */


import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class BuildingJavaPrograms5eBookStudyArrayLists1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String userName = input.nextLine();
        System.out.println();
        System.out.print("How many first name[s] do you want to enter? ");
        int num = input.nextInt();
        System.out.println();
        System.out.println("Welcome to my ArrayLists tutorial, " + userName + ".");
        System.out.println();
        ArrayList<String> list = new ArrayList<>();

        for (int count = 0; count <= num; count++) {

            System.out.println();

            System.out.print("Please add first name of friend to your list: ");
            String name = input.next();
            if (!list.contains(name)) {
            list.add(name);
            System.out.println("List : " + name);
            System.out.println("After Duplicates Removal List Update : " + list);

            }
        }

        System.out.println("List : " + list);

    }
}




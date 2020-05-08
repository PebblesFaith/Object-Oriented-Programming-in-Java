/* Object Oriented Programming in Java (Microsoft Dev 277x) online course from Instructor, Kasey Champion's
   Practice-It! Assignment for BJP4 Self-Check 10.16 Array List Mystery 2.
   Completed by Sarai Hannah Ajai Dated on May 07, 2020. */

import java.util.ArrayList;

public class BJP5SelfCheckChapter10Problem16ArrayListMystery2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        /*list.add(8);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(4);
        list.add(-1);
        list.add(3);
        list.add(28);
        list.add(17);
        list.add(9);
        list.add(33);*/

        mystery2(list);
    }

    public static void mystery2(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.add(list.get(i));
            } else {
                list.add(0, list.get(i));
            }

        }

        System.out.println(list);
    }
}

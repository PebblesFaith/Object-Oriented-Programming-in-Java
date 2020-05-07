/* Object Oriented Programming in Java (Microsoft Dev 277x) course from Instructor, Kasey Champion's
   Practice-It! Assignment for BJP4 Self-Check 10.17 Array List Mystery 3.
   Completed by Sarai Hannah Ajai Dated on May 07, 2020. */


import java.util.ArrayList;

public class BJP5SelfCheckChapter10Problem17ArrayListMystery3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        /*list.add(72);
        list.add(20);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);*/
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        mystery3(list);
    }

        public static void mystery3(ArrayList<Integer> list) {
        for (int i = list.size() - 2; i > 0; i--) {
            int a = list.get(i);
            int b = list.get(i + 1);
            list.set(i, a + b);

        }

        System.out.println(list);
    }
}

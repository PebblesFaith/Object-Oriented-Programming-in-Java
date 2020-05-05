/* Object Oriented Programming in Java (Microsoft Dev 277x) course from Instructor, Kasey Champion's
   Practice-It! Assignment for BJP4 Self-Check 7.19 Matrix Add.
   Completed by Sarai Hannah Ajai Dated on May 04, 2020. */

import java.util.Arrays;

public class BJP5SelfCheckChapter7Problem19MatrixAdd {
    public static void main(String []args){
        int x = 0;
        int [] a = new int[4];

        x++;
        mystery(x, a);
        System.out.println( x + " " + Arrays.toString(a));
        x = x + 1;
        mystery(x, a);
        System.out.println( x + " " + Arrays.toString(a));
    }

    public static void mystery(int x, int[] a) {
        x = x + 1;
        a[x] = a[x] + 1;
        System.out.println( x + " " + Arrays.toString(a));
    }
}

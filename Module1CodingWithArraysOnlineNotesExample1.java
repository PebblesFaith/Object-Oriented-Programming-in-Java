import java.util.Arrays;

public class Module1CodingWithArraysOnlineNotesExample1 {
    public static void main(String[] args) {
        int [] a = new int[5];
        double[] b = new double[10];
        char [] c = new char[20];

        a[0] = 15;

        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        b[3] = 40;
        b[4] = 50;

        c[0] = 'a';
        c[1] = 'b';
        c[2] = 'c';
        c[3] = 'd';
        c[4] = 'e';
        c[5] = 'f';
        c[6] = 'g';
        c[7] = 'h';
        c[8] = 'i';
        c[9] = 'j';
        c[10] = 'l';
        c[11] = 'k';

        int aLength = a.length; // returns 5
        int bLength = b.length; // returns 10
        int cLength = c.length; // returns 20

        for (int i = 0; i < aLength; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < bLength; i++) {
            System.out.println(b[i]);
        }

        for (int i = 0; i < cLength; i++) {
            System.out.println(c[i]);
        }


    }
}

// Module 1 | Reference Semanitcs
// Completed by: Sarai Hannah Ajai
// Dated on April 29, 2020

public class Module1ReferenceSemanticsOnlineNotesQuizQuestion1 {
    public static void main(String[] args) {
        int[] x = new int[3];
        x[0] = 1;
        x[1] = 2;

        int[] y = x;
        y[2] =3;


        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }


    }
    
}

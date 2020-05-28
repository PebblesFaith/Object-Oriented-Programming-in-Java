public class Module2PublicVSPrivateOnlineNotesExample1 {
    private String name;
    private double gpa;
    private int daysAbsent;
    private boolean canGraduate;

   private void Student1(String name, double gpa, int daysAbsent, boolean canGraduate) {
        this.name = name;
        this.gpa = gpa;
        this.daysAbsent = daysAbsent;
        this.canGraduate = canGraduate;
    }

    /* Create a new student at the beginning of the school year.     */

    public String getName() {
       return "Suzy Q";
    }

    /* Create a new student joining later in the school year.     */


    public static void main(String[] args) {

        Module2PublicVSPrivateOnlineNotesExample1 student1 = new Module2PublicVSPrivateOnlineNotesExample1();
        student1.getName();
        System.out.println(student1.getName());



    }




}

// Module 2 | Behavior Quiz Number 2
// Completed by: Sarai Hannah Ajai
// Dated on May 22, 2020

public class Module2BehaviorOnlineNotesQuizQuestion2 {
    boolean enrolled = false;
    int credits = 0;

    public void setEnrolled(int registeredCredits) {
        this.credits += registeredCredits;
        this.enrolled = (credits > 15);
        //registeredCredits = credits;
        //this.enrolled = (credits > 15);
        //this.enrolled = (credits += registeredCredits);
    }

    public static void main(String[] args) {
        Module2BehaviorOnlineNotesQuizQuestion2 student = new Module2BehaviorOnlineNotesQuizQuestion2();
        student.setEnrolled(20);
        System.out.println(student.enrolled);

    }
}

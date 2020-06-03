// Module 2 | What is Static Question 2
// Completed by: Sarai Hannah Ajai
// Dated on June 2, 2020

public class Module2WhatIsStaticOnlineNotesQuizQuestion2 {
    private static int studentCount = 0;

    public Module2WhatIsStaticOnlineNotesQuizQuestion2() {
        studentCount++;
    }

    public static int getStudentCount() {
        return  studentCount;
    }

     public static void main(String[] args) {
        Module2WhatIsStaticOnlineNotesQuizQuestion2 student1 = new Module2WhatIsStaticOnlineNotesQuizQuestion2();
        Module2WhatIsStaticOnlineNotesQuizQuestion2 student2 = new Module2WhatIsStaticOnlineNotesQuizQuestion2();
        Module2WhatIsStaticOnlineNotesQuizQuestion2 student3 = new Module2WhatIsStaticOnlineNotesQuizQuestion2();

        System.out.println("The correct syntax to 'get' the count of students across all object instances is " + Module2WhatIsStaticOnlineNotesQuizQuestion2.getStudentCount() + ".");


     }
}

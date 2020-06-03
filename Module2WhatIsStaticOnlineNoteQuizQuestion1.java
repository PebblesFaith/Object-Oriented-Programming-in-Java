// Module 2 | What is Static Question 1
// Completed by: Sarai Hannah Ajai
// Dated on June 2, 2020

public class Module2WhatIsStaticOnlineNoteQuizQuestion1 {

    private static int studentCount;

    public void graduate() {
        studentCount++;
        System.out.println("My answer is number " +  studentCount + ".");
    }

    public static void main(String[] args) {
        Module2WhatIsStaticOnlineNoteQuizQuestion1 student1 = new Module2WhatIsStaticOnlineNoteQuizQuestion1();
        Module2WhatIsStaticOnlineNoteQuizQuestion1 student2 = new Module2WhatIsStaticOnlineNoteQuizQuestion1();
        Module2WhatIsStaticOnlineNoteQuizQuestion1 student3 = new Module2WhatIsStaticOnlineNoteQuizQuestion1();

        student1.graduate();
        student2.graduate();

    }
}

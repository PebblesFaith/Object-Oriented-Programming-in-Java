// Module 2 | What is Static Online Notes Example 2
// Completed by: Sarai Hannah Ajai
// Dated on June 2, 2020

public class Module2WhatIsStaticOnlineNotesExample2 {
    private static int bikeCount;

    public Module2WhatIsStaticOnlineNotesExample2() {
        bikeCount++;
    }

    public static void main(String[] args) {
        Module2WhatIsStaticOnlineNotesExample2 bike1 = new Module2WhatIsStaticOnlineNotesExample2();
        Module2WhatIsStaticOnlineNotesExample2 bike2 = new Module2WhatIsStaticOnlineNotesExample2();

        int bikeCount = Module2WhatIsStaticOnlineNotesExample2.bikeCount;
        System.out.println(bikeCount);

    }
}

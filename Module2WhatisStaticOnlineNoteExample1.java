// Module 2 | What is Static Online Notes Example 1
// Completed by: Sarai Hannah Ajai
// Dated on June 2, 2020


public class Module2WhatisStaticOnlineNoteExample1 {

        public static String country = "United States";

        public void setCountry(String c) {
            country = country;
        }
        public String getCountry() {
           return country;
        }
        public static void main( String args[] ) {
            Module2WhatisStaticOnlineNoteExample1 c1 = new Module2WhatisStaticOnlineNoteExample1();
            Module2WhatisStaticOnlineNoteExample1 c2 = new Module2WhatisStaticOnlineNoteExample1();
            Module2WhatisStaticOnlineNoteExample1 c3 = new Module2WhatisStaticOnlineNoteExample1();
            c1.getCountry();
            c2.getCountry();
            c3.getCountry();
            //Module2WhatisStaticOnlineNoteExample1.setCountry("USA");
            c1.getCountry();
            c2.getCountry();
            c3.getCountry();
            System.out.printf("Current country: %s \n", c1.getCountry());
        }


}

// Module 2 | Behavior Online Notes Example 2
// Completed by: Sarai Hannah Ajai
// Dated on May 22, 2020

public class Module2BehaviorOnlineNoteExample2 {
    private String brand;
    private String model;
    private double listPrice = 0.0;

    public void getBrand() {

        System.out.println("This getBrandInfo method");
    }


    public static void main(String[] args) {
        Module2BehaviorOnlineNoteExample2 bike1 = new Module2BehaviorOnlineNoteExample2();
        bike1.getBrand();

        bike1.model = "C0l5s";
        bike1.listPrice = 250.00;

        System.out.println("Brand: " + bike1.brand + " Model: " + bike1.model + " List Price: " + bike1.listPrice );


    }

}

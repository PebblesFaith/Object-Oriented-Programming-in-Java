// Module 2 | Behavior Online Notes Example 3
// Completed by: Sarai Hannah Ajai
// Dated on May 22, 2020

public class Module2BehaviorOnlineNoteExample3 {
    String brand = "Moose";
    String model = "C0215ge";
    double listPrice = 0.0;
    int tireSize = 24;
    boolean isSold = false;
    private double salePrice = 250.0;

    public String getBrand() {
        return brand + " " + model + " $" + salePrice;

    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double newVal) {
        salePrice += 50.0;
    }

    public static void main(String[] args) {
        Module2BehaviorOnlineNoteExample3 info = new Module2BehaviorOnlineNoteExample3();
        info.getBrand();
        System.out.println(info.getBrand());
        info.getSalePrice();
        System.out.println(info.getSalePrice());
        info.setSalePrice(50);
        System.out.println(info.getSalePrice());

    }
}
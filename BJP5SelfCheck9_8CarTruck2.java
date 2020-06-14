/*
    Object Oriented Programming in Java (Microsoft Dev 277x) online course from Instructor, Kasey Champion's
    Practice-It! Assignment for BJP4 Self-Check 9.8 CarTruck.
    Completed by Sarai Hannah Ajai Dated on June 14, 2020.
  */

// Consider the following Truck automobile class Inheritance branch:
public class BJP5SelfCheck9_8CarTruck2 extends BJP5SelfCheck9_8CarTruck1 {
    public void m1() {
        System.out.println("truck 1");
    }
    public void m2() {
        super.m1();
    }
    public String toString() {
        return super.toString() + super.toString();
    }
}

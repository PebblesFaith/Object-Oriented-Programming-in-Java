import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.*;

import static java.time.Period.*;

public class Persons {
    private String firstName1;
    private String firstName2;
    private String middleName;
    private String lastName;
    private int dateOfBirth;
    private int age;

    public Persons(String firstName1, String firstName2, String middleName, String lastName, int dobDay, int age) {
        this.firstName1 = firstName1;
        this.firstName2 = firstName2;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
    }
    Scanner input = new Scanner(System.in);
    Date date = new Date();

    public void setFirstName1(Scanner input) {
            System.out.print("Please enter your first name? ");
            String firstName1 = input.nextLine().trim();
            System.out.print("Please verify your first name? ");
            String firstName2 = input.nextLine().trim();
            if (firstName1.equals(firstName2)) {
                System.out.println("You have enter, your first name as, " + firstName2.toUpperCase() + ", successfully.");
            } else if (firstName1.length() != firstName2.length()) {
                while (firstName1.length() != firstName2.length()) {
                    System.out.print("Please enter your first name? ");
                    firstName1 = input.nextLine().trim();
                    System.out.print("Please verify your first name? ");
                    firstName2 = input.nextLine().trim();
                    if (firstName1.equals(firstName2)) {
                        System.out.println("You have enter, your first name as, " + firstName2.toUpperCase() + ", successfully.");
                    }
                }
            }

        System.out.println();
    }

    public String getFirstName1() {
        return this.firstName1;
    }
    public String getFirstName2() {
        return  firstName2;
    }


    public void setMiddleName() {

        System.out.print("What is your middle name? ");
        String middleName = input.nextLine();

        if (middleName.length() == 0) {
            while (middleName.length() == 0) {
                System.out.print("Please enter your middle name? ");
                middleName = input.nextLine();
            }
        } else {
            System.out.println("You have enter your middle name? ");
        }
        System.out.println();
    }
    public String getMiddleName() {
        return  middleName;
    }

    public void setLastName() {
        System.out.print("What is your last name? ");
        String lastName = input.nextLine();

        if (lastName.length() == 0) {
            while (lastName.length() == 0) {
                System.out.print("Please enter your last name? ");
                lastName = input.nextLine();
            }
        } else {
            System.out.println("You have enter your last name? ");
        }
        System.out.println();
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setDobDay() {

        // Get user input: yyyy-mm-dd

        System.out.print("What is your date of birth (example yyyy-mm-dd format)? ");

        // Store the input as string
        String dob = input.next();

        // Convert string input to date format
        LocalDate dateOfBirth = LocalDate.parse(dob);

        // Get todays date: yyyy-mm-dd
        LocalDate currDate = LocalDate.now();

        // Get the difference between the two dates
        Period period = Period.between(currDate, dateOfBirth);

        if (dateOfBirth.equals("yyyy-mm-dd")) {
            while (dateOfBirth.equals("yyyy-mm-dd")) {
                System.out.print("Please enter your date of birth? ");
                dob = input.nextLine();
            }
        } else {
            System.out.println("You have enter your date of birth? ");
        }
        System.out.println();




        // Isolate the number of years to get proper age format
        int age  = Math.abs(period.getYears());

        System.out.println(age);

        System.out.println("You are " + age + " years of age.");
    }



    public int getDobDay() {

        return dateOfBirth;
    }



}

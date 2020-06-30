
import java.util.Scanner;
public class PersonsMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PersonProfile personVehicleOne = new PersonProfile("", "", "", 0, "", "", "", "", 0, 0);

        personVehicleOne.setFirstName1(personVehicleOne.input);
        personVehicleOne.setMiddleName();
        personVehicleOne.setLastName();
        personVehicleOne.setDobDay();
        personVehicleOne.setMake(input);
        personVehicleOne.setModel();
        personVehicleOne.setExteriorColor();
        personVehicleOne.setVehicleYear();


        System.out.println(personVehicleOne.getFirstName2());


        input.close();





    }

}

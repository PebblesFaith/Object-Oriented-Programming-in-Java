import java.util.Scanner;

public class PersonProfile extends Persons {
    private String make;

    private String model;
    private String exteriorColor;
    private int vehicleYear;

    public PersonProfile(String make, String model, String exteriorColor, int vehicleYear, String firstName1, String firstName2, String middleName, String lastName, int dobDay, int age) {
        super(firstName1, firstName2, middleName, lastName, dobDay, age);

        this.make = make;
        this.model = model;
        this.exteriorColor = exteriorColor;
        this.vehicleYear = vehicleYear;
    }

        Scanner input = new Scanner(System.in);

        public void setMake(Scanner input) {

            String make1 = "Ford";
            String make2 = "Cadillac";

            System.out.print("What is the make of your vehicle? ");
            String make = input.nextLine().trim();
            while (!make1.equals(make) && !make2.equals(make) && make.equals("")) {
                System.out.print("What is the make of your vehicle? ");
                make = input.nextLine().trim();
            }
            System.out.println("Your have entered " + make.toUpperCase() + ", as a make of your vehicle.");
            System.out.println();
        }

        public String getMake(){
            return make;
        }

        public void setModel() {

            String model1 = "Mustang";
            String model2 = "Fiesta";
            String model3 = "EcoSport";
            String model4 = "Explorer";
            String model5 = "F-150";
            String model6 = "Range";
            String model7 = "Fusion";
            String model8 = "Escape";
            String model9 = "Edge";
            String model10 = "F-250";
            String model11 = "Transit Connect";
            String model12 = "F-350";
            String model13 = "Expedition";
            String model14 = "Taurus";
            String model15 = "Flex";
            String model16 = "F-450";
            String model17 = "Fusion Hybrid";
            String model18 = "Expedition Max";
            String model19 = "Fusion Energi";

            System.out.print("What is the model of your vehicle? ");
            String model = input.nextLine().trim();

            while(!model1.equals(model) && !model2.equals((model)) && !model3.equals(model) && !model4.equals(model) && !model5.equals(model) && !model6.equals(model) && !model7.equals(model) && !model8.equals(model) && !model9.equals(model) && !model10.equals(model) && !model11.equals(model) && !model12.equals(model) && !model13.equals(model) && !model14.equals(model) && !model15.equals(model) && !model16.equals(model) && !model17.equals(model) && !model18.equals(model) && !model19.equals(model) || model.isEmpty()) {
                System.out.print("What is the model of your vehicle? ");
                model = input.nextLine().trim();
            }
            System.out.println("Your have entered " + model.toUpperCase() + ", as a model of your vehicle.");
            System.out.println();

        }

        public String getModel(){
            return model;
        }

        public void setExteriorColor() {

            String color1 = "Oxford White";
            String color2 = "Agate Black";
            String color3 = "Orange Fury";
            String color4 = "Velocity Blue";
            String color5 = "Ingot Silver";
            String color6 = "Shadow Black";
            String color7 = "Magnetic Metallic";
            String color8 = "Kona Blue";
            String color9 = "Rudy Red";
            String color10 = "Rich Copper";
            String color11 = "White Gold";
            String color12 = "White Platinum";
            System.out.println();

            System.out.println("Chose your exterior color of your vehicle from the list below: \r\n Agate Black \r\n Ingot Silver \r\n Kona Blue \r\n Magnetic Metallic \r\n Orange Fury \r\n Oxford White \r\n Rich Copper \r\n Rudy Red \r\n Shadow Black \r\n Velocity Blue \r\n White Gold \r\n White Platinum");

            System.out.print("What is the exterior color of your vehicle? ");
            String exteriorColor = input.nextLine().trim();

            while (!color1.equals(exteriorColor) && !color2.equals(exteriorColor) && !color3.equals(exteriorColor) && !color4.equals(exteriorColor) && !color5.equals(exteriorColor) && !color6.equals(exteriorColor) && !color7.equals(exteriorColor) && !color8.equals(exteriorColor) && !color9.equals(exteriorColor) && !color10.equals(exteriorColor) && !color11.equals(exteriorColor) && !color12.equals(exteriorColor) || exteriorColor.isEmpty()) {
                System.out.println();
                System.out.print("What is the exterior color of your vehicle? ");
                exteriorColor = input.nextLine().trim();
            }
            System.out.println("Your have entered " + exteriorColor.toUpperCase() + ", as your vehicle color.");
            System.out.println();
        }

        public String getExteriorColor(){
            return exteriorColor;
        }

        public void setVehicleYear() {
            int year1 = 1900;
            int year2 = 2021;

            System.out.print("What is your year make of your vehicle? ");
            int vehicleYear = input.nextInt();

            while (!(vehicleYear >= 1900) || !(vehicleYear <= 2021)) {
                System.out.print("What is your year make of your vehicle? ");
                vehicleYear = input.nextInt();
            }

            System.out.println("You have entered " + vehicleYear + ", as a year make of your vehicle.");
            System.out.println();
        }

        public int getVehicleYear() {
            return vehicleYear;
        }

    }

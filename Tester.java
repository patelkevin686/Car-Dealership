import java.util.ArrayList;

public class Tester {

   public static void main(String[] args) {


       Car car1 = new Car("Ford", "Figo", 2018, "Power", 140, "Hatchback");
       Car car2 = new Car("Ford", "Endeavour", 2019, "Power", 220, "SUV");

       ArrayList<Car> cars = new ArrayList<>();
       cars.add(car1);
       cars.add(car2);

       ArrayList<String> managers = new ArrayList<>();
       managers.add("Henry");
       managers.add("Rahul");

       ArrayList<String> employees = new ArrayList<>();
       employees.add("Virat");
       employees.add("Rohit");

       Dealership dealership1 = new Dealership(cars, "Center", "Mumbai", managers, employees);

       System.out.println(dealership1);
       System.out.println("\n");

       car1 = new Car("Toyota", "Etios", 2015, "Power", 200, "sedan");

       cars = new ArrayList<>();

       cars.add(car1);

       managers = new ArrayList<>();
       managers.add("Hardik");

       employees = new ArrayList<>();
       employees.add("Nisarg");

       Dealership dealership2 = new Dealership(cars, "T-cars", "Delhi", managers, employees);

       System.out.println(dealership2);

   }

}
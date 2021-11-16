import java.util.ArrayList;

public class Dealership {

   private ArrayList<Car> cars=new ArrayList<>();
   private String name;
   private String location;
   private ArrayList<String> managers=new ArrayList<>();
   private ArrayList<String> employees=new ArrayList<>();

   public Dealership(ArrayList<Car> cars, String name, String location, ArrayList<String> managers, ArrayList<String> employees) {
       this.cars = cars;
       this.name = name;
       this.location = location;
       this.managers = managers;
       this.employees = employees;

   }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public ArrayList<String> getManagers() {
        return this.managers;
    }

    public ArrayList<String> getEmployees() {
        return this.employees;
    }

    public ArrayList<Car> getCars() {
        return this.cars;
    }


    public void setName(String name) {
        this.name=name;
    }

    public void setLocation(String location) {
        this.location=location;
    }

    public void setManagers(ArrayList<String> managers) {
        this.managers=managers;
    }

    public void setEmployees(ArrayList<String> employees) {
        this.employees=employees;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars=cars;
    }

    //add to arraylist.
    public void addManager(String manager) {
        this.managers.add(manager);
    }

    public void addEmployee(String employee) {
        this.employees.add(employee);
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }


   @Override
   public String toString() {
       return "Dealership \ncars = " + cars + " \nName = " + name + ", Location = " + location + "\nManagers = " + managers
               + "\nEmployees = " + employees + "";
   }

}

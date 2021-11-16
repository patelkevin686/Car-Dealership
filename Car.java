public class Car {
   
   // Instance variables
   private String make;
   private String model;
   private int year;
   private String transmission;
   private int maximumSpeed;
   private String type;

   public Car(String make, String model, int year, String transmission, 

   int maximumSpeed, String type) {
       this.make = make;
       this.model = model;
       this.year = year;
       this.transmission = transmission;
       this.maximumSpeed = maximumSpeed;
       this.type = type;
   }
   
   @Override
   public String toString() {
       return "\nMake = " + make + ", \nModel = " + model + ", \nYear = " + year + ", \nTransmission = " + transmission
               + ", \nMaximumSpeed = " + maximumSpeed + ", \nType = " + type + "";
   }

}
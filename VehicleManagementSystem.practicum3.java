import java.util.Scanner;
abstract class Vehicle {
    String brand;
    String vehicleNumber;
    Vehicle(String brand, String vehicleNumber) {
        this.brand = brand;
        this.vehicleNumber = vehicleNumber;
    }
    void showVehicleIdentity() {
        System.out.println("Brand: " + brand + ", Number: " + vehicleNumber);
    }
    abstract void startEngine();
}
final class Insurance {
    final void insuranceDetails() {
        System.out.println("All vehicles must have insurance.");
    }
}
class Car extends Vehicle {
    Car(String brand, String vehicleNumber) {
        super(brand, vehicleNumber);
    }
    void startEngine() {
        System.out.println("Car starting ...");
    }
}
class Bike extends Vehicle {
    Bike(String brand, String vehicleNumber) {
        super(brand, vehicleNumber);
    }
    void startEngine() {
        System.out.println("Bike starting ...");
    }
}
public class VehicleManagementSystem {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Brand: ");
        String carBrand = sc.nextLine();
        System.out.print("Enter Car Number: ");
        String carNumber = sc.nextLine();
        Car car = new Car(carBrand, carNumber);
        car.showVehicleIdentity();
        car.startEngine();
        System.out.println();
        System.out.print("Enter Bike Brand: ");
        String bikeBrand = sc.nextLine();
        System.out.print("Enter Bike Number: ");
        String bikeNumber = sc.nextLine();
        Bike bike = new Bike(bikeBrand, bikeNumber);
        bike.showVehicleIdentity();
        bike.startEngine();
        System.out.println();
        Insurance ins = new Insurance();
        ins.insuranceDetails();
        sc.close();
    }
}

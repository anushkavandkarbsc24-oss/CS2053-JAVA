class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("This is Vehicle");
    }

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    int wheels;

    Car(String brand, int wheels) {
        super(brand); 
        this.wheels = wheels;
        System.out.println("Car constructor called");
    }

    void start() {
        super.start(); 
        System.out.println("Car is starting with " + wheels + " wheels");
    }
}

class ElectricCar extends Car {
    int battery;

    ElectricCar(String brand, int wheels, int battery) {
        super(brand, wheels); 
        this.battery = battery;
        System.out.println("This is Electric Car");
    }

    void start() {
        super.start(); 
        System.out.println("Electric Car is starting silently with battery capacity of " + battery + " kWh...");
    }
}

public class Lab3 {
    public static void main(String[] args) {
        ElectricCar audi = new ElectricCar("Audi", 4, 75);
        audi.start();
    }
}
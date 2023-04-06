public class Vehicle {
    double topSpeed;
    int numWheels;

    Vehicle(double topSpeed, int numWheels) {
        this.topSpeed = topSpeed;
        this.numWheels = numWheels;
    }

    Vehicle(double topSpeed) {
        this.topSpeed = topSpeed;
        this.numWheels = 4;
    }

    Vehicle() {
        this.topSpeed = 70;
        this.numWheels = 4;
    }

    public void displayDetails() {
        System.out.println("Top Speed: " + this.topSpeed);
        System.out.println("Number of Wheels: "  + this.numWheels);
    }
}

public class Car extends Vehicle {

    Car(double topSpeed, int numWheels) {
        super(topSpeed, numWheels);
    }

    Car(double topSpeed) {
        super(topSpeed, 4);
    }

    Car() {
        super(80, 4);
    }

    @Override 
    public void displayDetails() {
        System.out.println("I'm a car vroom vroom");
        System.out.println("Top Speed: " + this.topSpeed);
        System.out.println("Number of Wheels: "  + this.numWheels);
    }
}

public class Motorcycle extends Vehicle{

    Motorcycle(double topSpeed, int numWheels) {
        super(topSpeed, numWheels);
    }
    
    Motorcycle(double topSpeed) {
        super(topSpeed, 2);
    }

    Motorcycle() {
        super(120, 2);
    }

    @Override
    public void displayDetails() {
        System.out.println("Motocicleta is motorcycle in Spanish");
        System.out.println("Top Speed: " + this.topSpeed);
        System.out.println("Number of Wheels: "  + this.numWheels);
    }
}

public class ViewVehicles {
    public static void main(String[] args) {
        Motorcycle harley = new Motorcycle();
        Car beemer = new Car(82.33);
        Vehicle panzer = new Vehicle(55.66, 0);

        harley.displayDetails();
        beemer.displayDetails();
        panzer.displayDetails();
    }
}
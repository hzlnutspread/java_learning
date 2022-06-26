package Object_oriented_programming;

public class Car {

    String make = "Corvette";
    String model = "Stingray";
    int year = 2021;
    String colour = "blue";
    double price = 50000.00;

    public String toString() {

        return make + "\n" + model + "\n" + colour + "\n" + year;

    }

    void drive() {
        System.out.println("You drive the car");
    }
    void brake() {
        System.out.println("You step on the breaks");
    }
}

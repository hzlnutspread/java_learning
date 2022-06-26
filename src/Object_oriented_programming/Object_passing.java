package Object_oriented_programming;

public class Object_passing {

    public static void main(String[] args) {

        //pass objects as arguments
        Garage garage = new Garage();

        Car_objectPassing car = new Car_objectPassing("BMW");
        Car_objectPassing car2 = new Car_objectPassing("Corvette");

        garage.park(car);
        garage.park(car2);

    }
}
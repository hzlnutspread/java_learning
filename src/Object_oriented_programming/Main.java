//object = instance of a class that may contain attributes and methods
//e.g = phone desk computer whatever
package Object_oriented_programming;

public class Main {

    public static void main(String[] args) {

        Car Car1 = new Car();
        Car Car2 =  new Car();

        System.out.println(Car1.make);
        System.out.println(Car1.model);
        System.out.println(Car1.colour);
        System.out.println(Car1.year);
        System.out.println(Car1.price);
        System.out.println();
        System.out.println(Car2.make);
        System.out.println(Car2.model);

        Car1.drive();
        Car1.brake();

        Car2.drive();
        Car2.brake();


    }
}

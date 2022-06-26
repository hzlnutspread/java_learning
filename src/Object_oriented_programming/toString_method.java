//toString() = all objects inherit this
// string that "textually represents" an object.
// can be used both implicitly and explicitly

package Object_oriented_programming;

public class toString_method {

    public static void main(String[] args) {

        Car car = new Car();

//        System.out.println(car.make);
//        System.out.println(car.model);
//        System.out.println(car.colour);
//        System.out.println(car.year);
        System.out.println(car.toString()); //explicit use of toString
        System.out.println(car); //implicit use of toString

    }
}
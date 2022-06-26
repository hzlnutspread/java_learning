package Object_oriented_programming;

public class Encapsulation {

    public static void main(String[] args) {

        Encapsulation_class car = new Encapsulation_class("Chevrolet", "Camaro", 2021);

        car.setYear(2022);

        System.out.println(car.getYear());


    }
}

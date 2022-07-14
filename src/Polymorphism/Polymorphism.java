package Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {


        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.eat(3);
        myDog.eat();

        Animal cat = new Cat(); // Polymorphism example. Animal=reference type. Cat()=object type
        cat.eat();

    }
}


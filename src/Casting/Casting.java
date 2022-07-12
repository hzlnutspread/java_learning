package Casting;

public class Casting {

    public static void main(String[] args) {

        // Upcasting = Take an object and cast it to its super class type (parent type)
        // Downcasting = Cast an object to one of its sub types (child types)

        // Lets try cast a dog into an animal with upcasting
        // myAnimal has reference type of Animal
        // You can do anything with myAnimal that you could with any other animal.
        // Can't do things that only apply to dogs though like growl()
        Animal myAnimal = new Dog(); // Creating a new dog but upcasting it to be an animal

        doAnimalStuff(myAnimal); // myAnimal is actually a new Dog() so it says woof woof

    }

    public static void doAnimalStuff(Animal animal) { // Any animal/subclass of animal can be put here
        animal.makeNoise();
        // Doing this makes the upcasting happen implicitly within the method
        // This can save time because you don't have to create a method for each subclass of Animal
        // This can apply to cats and dogs and whatever else you want that is a subclass of Animal

        if (animal instanceof Dog) { // instanceof check to see if its a dog or not
            Dog myDog = (Dog) animal;
            myDog.growl();
        }
    }
}
